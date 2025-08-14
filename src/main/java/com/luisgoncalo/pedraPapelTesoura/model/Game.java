package com.luisgoncalo.pedraPapelTesoura.model;

import java.util.List;

public class Game {
    private Player player1;
    private Player maquina;

    boolean jogo_terminado = false;

    private int vitoriasJogador1 = 0;
    private int vitoriasMaquina = 0;

    public Game(String player1Name){
        this.player1 = new Player(player1Name);
        this.maquina = new Player("Maquina");
    }

    public void setJogadaJogador1(Jogada jogada) {
        player1.setJogada(jogada);
    }

    public void setJogadaMaquina() {
        List<Jogada> jogadas = List.of(Jogada.values());
        maquina.setJogada(jogadas.get((int) (Math.random() * jogadas.size())));
    }

    public String getResultado() {

        Jogada jogadaJogador1 = player1.getJogada();
        Jogada jogadaMaquina = maquina.getJogada();

        if (jogadaJogador1.venceDe(jogadaMaquina)) {
            vitoriasJogador1++;
            jogo_terminado = true;
            return player1.getName() + " venceu";
        } else if (jogadaMaquina.venceDe(jogadaJogador1)) {
            vitoriasMaquina++;
            jogo_terminado = true;
            return maquina.getName() + " venceu";
        } else {
            return "Empate";
        }
    }

    public boolean isFinalizado() {
        return jogo_terminado;
    }
}
