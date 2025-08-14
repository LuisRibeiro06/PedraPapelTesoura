package com.luisgoncalo.pedraPapelTesoura.dto;

import com.luisgoncalo.pedraPapelTesoura.model.Jogada;

public class ResultadoResponse {

    private String resultadoRonda;
    private Jogada jogadaComputador;
    private int vitoriasJogador;
    private int vitoriasComputador;
    private String resultadoFinal;

    public ResultadoResponse(String resultadoRonda, Jogada jogadaComputador, int vitoriasJogador, int vitoriasComputador, String resultadoFinal) {
        this.resultadoRonda = resultadoRonda;
        this.jogadaComputador = jogadaComputador;
        this.vitoriasJogador = vitoriasJogador;
        this.vitoriasComputador = vitoriasComputador;
        this.resultadoFinal = resultadoFinal;
    }

    public String getResultadoRonda() {
        return resultadoRonda;
    }
    public Jogada getJogadaComputador() {
        return jogadaComputador;
    }
    public int getVitoriasJogador() {
        return vitoriasJogador;
    }
    public int getVitoriasComputador() {
        return vitoriasComputador;
    }
    public String getResultadoFinal() {
        return resultadoFinal;
    }
}
