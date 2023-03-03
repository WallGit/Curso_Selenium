$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desconto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Receber desconto da qazando",
  "description": "Eu como usuário da qazando\r\nquero receber um cupom de desconto\r\npara comprar um curso com valor reduzido",
  "id": "receber-desconto-da-qazando",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 18,
  "name": "xpto",
  "description": "",
  "id": "receber-desconto-da-qazando;xpto",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 17,
      "name": "@gerar-cupom-rapido"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "que tenho um cupom gerado",
  "keyword": "Dado "
});
formatter.match({
  "location": "DescontosStep.gerarCupom()"
});
formatter.result({
  "duration": 4503841600,
  "status": "passed"
});
});