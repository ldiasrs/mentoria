package com.thoughtworks.orientacaoobjetos;

public class PedidoComDesconto extends Pedido {

    private float desconto;

    public PedidoComDesconto(String codPedido, float desconto) {
        super(codPedido);
        this.desconto = desconto;
    }

    @Override
    public float calcularTotalDeItens() {
        float valor = super.calcularTotalDeItens();
        valor = valor - desconto;
        return valor;
    }
}
