$ErrorActionPreference = "Stop"

$raizProjeto = $PSScriptRoot
$diretorioBuild = Join-Path $env:TEMP "academia-testes-automatizados"

$projetos = @(
    "codigo\segunda-feira\modelo-inicial",
    "codigo\segunda-feira\construtores-e-metodos",
    "codigo\segunda-feira\encapsulamento-validacao",
    "codigo\quarta-feira\desenvolvimento-incremental"
)

Write-Host "Executando testes automatizados..."

foreach ($projeto in $projetos) {
    $origem = Join-Path $raizProjeto $projeto
    $nomeBuild = $projeto.Replace("\", "-")
    $saida = Join-Path $diretorioBuild $nomeBuild

    New-Item -ItemType Directory -Path $saida -Force | Out-Null
    $fontes = Get-ChildItem -LiteralPath $origem -Filter "*.java" |
        Select-Object -ExpandProperty FullName

    # As etapas didáticas mantêm classes auxiliares no mesmo arquivo Main.java.
    & javac -encoding UTF-8 -Xlint:all,-auxiliaryclass -d $saida $fontes
    if ($LASTEXITCODE -ne 0) {
        throw "Falha de compilação em $projeto"
    }

    & java -ea -cp $saida Testes
    if ($LASTEXITCODE -ne 0) {
        throw "Falha nos testes de $projeto"
    }
}

Write-Host "Todos os testes passaram com sucesso."
