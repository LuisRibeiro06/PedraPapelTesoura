package com.luisgoncalo.pedraPapelTesoura.model;

import java.util.List;

public class Game {
    private Player player1;
    private Player maquina;

    private int vitoriasJogador1 = 0;
    private int vitoriasMaquina = 0;


    public Game(){
        this.player1 = new Player("Player 1");
        this.maquina = new Player("Maquina");
    }

    public void setJogadaJogador1(Jogada jogada) {
        player1.setJogada(jogada);
    }

    public void setJogadaMaquina() {
        List<Jogada> jogadas = List.of(Jogada.values());
        maquina.setJogada(jogadas.get((int) (Math.random() * jogadas.size())));
    }

    public Jogada getJogadaJogador1() {
        return player1.getJogada();
    }
    public Jogada getJogadaMaquina() {
        return maquina.getJogada();
    }

    public String getResultado() {

        Jogada jogadaJogador1 = player1.getJogada();
        Jogada jogadaMaquina = maquina.getJogada();

        if (jogadaJogador1.venceDe(jogadaMaquina)) {
            vitoriasJogador1++;
            return player1.getName() + " venceu";
        } else if (jogadaMaquina.venceDe(jogadaJogador1)) {
            vitoriasMaquina++;
            return maquina.getName() + " venceu";
        } else {
            return "Empate";
        }
    }

    public int getVitoriasJogador1() {
        return vitoriasJogador1;
    }
    public int getVitoriasMaquina() {
        return vitoriasMaquina;
    }

}
