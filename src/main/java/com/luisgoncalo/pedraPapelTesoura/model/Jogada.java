package com.luisgoncalo.pedraPapelTesoura.model;

public enum Jogada {
    PAPEL, PEDRA, TESOURA;

    public boolean venceDe(Jogada jogada) {
        return ( this == PEDRA && jogada == TESOURA ) ||
                ( this == PAPEL && jogada == PEDRA ) ||
                ( this == TESOURA && jogada == PAPEL );
    }
}
