package com.thoughtworks.orientacaoobjetos;

public class Item {

    private String descricao;
    private String categoria;
    private float valor;

    public Item(String descricaoArg, float valorArg, String categoriaArg) {
        this.descricao = descricaoArg;
        this.valor = valorArg;
        this.categoria = categoriaArg;
    }

    public Item(String descricaoArg, float valorArg) {
      this(descricaoArg, valorArg, "sem-categoria");
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricao + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valor=" + valor +
                '}';
    }
}
