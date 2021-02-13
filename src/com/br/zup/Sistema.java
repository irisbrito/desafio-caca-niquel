package com.br.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sistema {
    private Simbolo simbolos;
    Jogada jogada = new Jogada();
    private static List<Simbolo> listaFrutas = new ArrayList<>();

    public Sistema(){

    }

    public void menu(){
        IO.mostrarTexto("JOGO CAÇA NÍQUEL\n BANANA: 10 PONTOS \n MORANGO: 20 PONTOS \n ESTRELA: 40 PONTOS");
        IO.mostrarTexto("-------------------------");
        jogada.gerarJogada();
    }



   public void executarSistema(){
        menu();
    }

}

