package com.luisgoncalo.pedraPapelTesoura.controller;

import com.luisgoncalo.pedraPapelTesoura.dto.JogadaRequest;
import com.luisgoncalo.pedraPapelTesoura.dto.ResultadoResponse;
import com.luisgoncalo.pedraPapelTesoura.model.Game;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private final Game game = new Game();

    @RequestMapping("/jogar")
    public ResultadoResponse jogar(@RequestBody JogadaRequest jogadaRequest) {
        if (jogadaRequest.getJogada() == null) {
            return new ResultadoResponse(null, null, game.getVitoriasJogador1(), game.getVitoriasMaquina(), "Nenhuma jogada realizada");
        } else {
            game.setJogadaJogador1(jogadaRequest.getJogada());
            game.setJogadaMaquina();
            String resultado = game.getResultado();
            return new ResultadoResponse(resultado, game.getJogadaMaquina(), game.getVitoriasJogador1(), game.getVitoriasMaquina(), resultado == null ? "Empate" : resultado);
        }
    }

}
