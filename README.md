# Mentoria

Esse repositório tem a finalidade de armazenar códigos relacionados a mentoria de sessões de diferentes assuntos.

## Orientação a objetos - Exercício 1

**Especificação**
   - Fazer um sistema de pedidos 
   - Uma loja tem items a venda
   - Cada item tem um valor e uma descrição
   - Um Item pode ou não ter uma descrição de categoria: Ex: "Perecível", "Eletrodoméstico", "Eletrônico"
   - Um pedido tem um código(string), um conjunto de itens e um valor final
   - Represente em uma função main
   - 1) A instancia de 5 itens
   - 2) O pedido com estes itens
   ```
    Pedido numero: 002
       Item: "Arroz" Valor: R$ 3,00
       Item: "Feijão" Valor: R$ 4,00
    Total do pedido: R$ 7,00
   ```
**Requisitos**

   - O Item deve ter dois construtores considerando o com e sem categoria
   - O somatório dos itens deve ser feito usando composição dentro do Pedido
   - Criar um segundo objeto de pedido chamado PedidoComDesconto que deve ser uma extensão do Pedido
   - O PedidoComDesconto deve sobrecarregar o somatório dos itens aplicando um desconto específico sobre o valor final
   - **EXTRA**: Faça testes unitários para os métodos com lógica como o somátorio de pedidos

[Solução nesta pasta](https://github.com/ldiasrs/mentoria/tree/master/orientacao_objetos_exercicio_1/src/main/java/com/thoughtworks/orientacaoobjetos)

## Orientação a objetos - Exercício 2
**Especificação**
   - Fazer um sistema de envio de mensagens
   - Um aplicativo envia mensagens
   - Uma mensagem tem como atributos: um texto, um destinatario, um remetente e um tipo que pode ser [SMS, EMAIL] (podem usar enumeração aqui, enum)
   - Criar uma interface **EnviadorDeMensagens** com método enviarMsg que tem um argumento um objeto de mensagem
   - Criar uma implementação para o EnviadorDeMensages: **SMSEnviadorDeMensagens**
   - Essa implementação deve imprimir na tela
   
    Para: <destinatario>
    De: <remetente>
    Texto:
    <texto>
    Mensagem enviada por SMS
    
   - Criar uma implementação para o EnviadorDeMensages: **EMAILEnviadorDeMensagens**
   - Essa implementação deve imprimir na tela
   
    Para: <destinatario>
    De: <remetente>
    Texto:
    <texto>
    Mensagem enviada por EMAIL
    
   - Criar uma classe **EnviadorDeMenssagensFactory**(fabrica) que retorna uma interface de EnviadorDeMensagens
   - Essa classe deve ter um método static chamado: **construirEnviador** que recebe por parâmetro uma string
   - Se a string for **"SMS" ira instanciar SMSEnviadorDeMensagens**
   - Se a string for **"EMAIL" ira instanciar EMAILEnviadorDeMensagens**
   - Criar uma classe com **main** para executar o seguintes requisitos
   
 **Requisitos**
 
   1) Instanciar 100 mensagens SMS com texto diferente (dica: usem for e indexador concatenado a mensagem)
   2) Instanciar 50 mensagens EMAIL com texto diferente (dica: usem for e indexador concatenado a mensagem)
   3) Chamar a classe EnviadorDeMenssagensFactory para buscar o enviador de mensagem mandando o tipo da mensagem
   4) **Chamar** o método de **enviarMsg** do EnviadorDeMenssagens mandando a mensagem
   5) Ao final todas as mensagens devem ser imprimidas na tela
   
