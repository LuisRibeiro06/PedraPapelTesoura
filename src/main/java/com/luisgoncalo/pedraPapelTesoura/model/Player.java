package com.luisgoncalo.pedraPapelTesoura.model;

public class Player {

    private String name;
    private Jogada jogada;

    public Player(final String name) {
        this.name = name;
    }

    public void setJogada(final Jogada jogada) {
        this.jogada = jogada;
    }

    public String getName() {
        return name;
    }

    public Jogada getJogada() {
        return jogada;
    }
}
