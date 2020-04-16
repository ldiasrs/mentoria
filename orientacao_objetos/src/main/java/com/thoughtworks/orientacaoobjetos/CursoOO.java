package com.thoughtworks.orientacaoobjetos;

public class CursoOO {

    public static void main(String[] args) {
        Item feijao = new Item("Feijão", 5f, "alimentos");
        Item arroz = new Item("Arroz", 3f, "alimentos");
        Item massa = new Item("Massa", 2f, "alimentos");

        String codPedido = "Pedido do Leo";
        float desconto = 1;

        PedidoComDesconto pedido = new PedidoComDesconto(codPedido, desconto);

        pedido.addItem(feijao);
        pedido.addItem(arroz);
        pedido.addItem(massa);

        System.out.println("Pedido: " + pedido.getCodPedido());

        for (Item item : pedido.getItens()) {
            System.out.println(item);
        }

        System.out.println("Total: " + pedido.calcularTotalDeItens());

    }
}
