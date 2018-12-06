$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cieloMobileLogin.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 3,
      "value": "# Author: gutemberg.oliveira@inmetrics.com.br"
    }
  ],
  "line": 5,
  "name": "Poc cielo Mobile",
  "description": "",
  "id": "poc-cielo-mobile",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@funcionalidade"
    }
  ]
});
formatter.before({
  "duration": 5696100,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que inicializo o aplicativo Cielo Mobile",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "sou direcionado para a tela de Menu inicial",
  "keyword": "Entao "
});
formatter.match({
  "location": "CieloMobileLoginSteps.queInicializoOAplicativoCieloMobile()"
});
formatter.result({
  "duration": 69434517900,
  "status": "passed"
});
formatter.match({
  "location": "CieloMobileLoginSteps.souDirecionadoParaATelaDeMenuInicial()"
});
formatter.write("\n");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 6514154600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "poc-cielo-mobile;",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 12,
  "name": "que acesso a area Ja fez cadastro",
  "keyword": "Dado "
});
formatter.step({
  "line": 13,
  "name": "informo Numero Logico \"12345676543\" e email \"joao@akakak.com\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "vou para a proxima pagina",
  "keyword": "Entao "
});
formatter.match({
  "location": "CieloMobileLoginSteps.queAcessoAAreaJaFezCadastro()"
});
formatter.result({
  "duration": 558347100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345676543",
      "offset": 23
    },
    {
      "val": "joao@akakak.com",
      "offset": 45
    }
  ],
  "location": "CieloMobileLoginSteps.informoNumeroLogicoEEmail(String,String)"
});
formatter.result({
  "duration": 2014890200,
  "status": "passed"
});
formatter.match({
  "location": "CieloMobileLoginSteps.vouParaAProximaPagina()"
});
formatter.write("\n");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 6280627800,
  "status": "passed"
});
formatter.after({
  "duration": 4050826300,
  "status": "passed"
});
});