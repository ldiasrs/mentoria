package com.thoughtworks.orientacaoobjetos;

import java.util.List;

public class CalculadorTotalDePedidos {

    public float calcularTotalDeItens(List<Item> itens) {
        float valorTotal = 0;
        for (Item item : itens) {
            valorTotal = valorTotal + item.getValor();
        }
        return valorTotal;
    }
}
