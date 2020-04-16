package com.thoughtworks.orientacaoobjetos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> itens;
    private String codPedido;
    private CalculadorTotalDePedidos calculadorTotalDePedidos;

    public Pedido(String codPedido) {
        this.itens  = new ArrayList();
        this.codPedido = codPedido;
        calculadorTotalDePedidos = new CalculadorTotalDePedidos();
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    public float calcularTotalDeItens() {
       return calculadorTotalDePedidos.calcularTotalDeItens(itens);
    }

    public List<Item> getItens() {
        return itens;
    }
}
