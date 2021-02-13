package com.br.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogada {
    private Simbolo simbolo;
    List<Simbolo> sorteados = new ArrayList<>();

    private int opcoes;
    private int valorAleatorio;
    private int total;



    public Simbolo getSimbolo() {
        return simbolo;
    }

    public Jogada(){
        this.sorteados = sorteados;

    }


  public void sortear() {
      Random random = new Random();
      Simbolo[] todosOsSimbolos = Simbolo.values();
      opcoes = todosOsSimbolos.length;

      valorAleatorio = random.nextInt(opcoes);
      System.out.println(todosOsSimbolos[valorAleatorio]);
      System.out.println(todosOsSimbolos[valorAleatorio].getPontos());
      total += todosOsSimbolos[valorAleatorio].pontos;
      sorteados.add(todosOsSimbolos[valorAleatorio]);
  }

    public void gerarJogada() {
            sortear();
            sortear();
            sortear();
        calcularPontuacao();
    }


    public void calcularPontuacao(){
        IO.mostrarTexto("O seu total de pontos é: " + total);
    }
}
