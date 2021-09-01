#language: pt
#Author: gigimunhoz@hotmail.com

@tag
Funcionalidade: Validar formulario
  Eu como usuario quero preencher e enviar o formulario do site

  @tag1
  Cenario: Preencher formulario
    Dado que eu esteja no site "http://sampleapp.tricentis.com/101/app.php"
    Quando eu preencher e enviar o formulario
    Entao valido o envio do e-mail com sucesso