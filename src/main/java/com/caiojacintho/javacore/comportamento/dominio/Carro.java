package com.caiojacintho.javacore.comportamento.dominio;

public class Carro {
    private String nome = "Carro";
    private String color;
    private int ano;

    public Carro(String color, int ano) {
        this.color = color;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getColor() {
        return color;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", color='" + color + '\'' +
                ", ano=" + ano +
                '}';
    }
}
