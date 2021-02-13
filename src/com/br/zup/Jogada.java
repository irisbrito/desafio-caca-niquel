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
    private int quantidadeDeSorteios;



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
        if (quantidadeDeSorteios <= 3) {
            sortear();
            sortear();
            sortear();
        } else {
            for (int contador = 0; contador < quantidadeDeSorteios; contador ++) {
                sortear();
            }
        }
        calcularPontuacao();
    }

    public void verificarDificuldade(){
        IO.mostrarTexto("Caso queira aumentar a dificuldade digite um número maior que 3");
        quantidadeDeSorteios = IO.criarScanner().nextInt();
    }


    public void calcularPontuacao(){
        IO.mostrarTexto("O seu total de pontos é: " + total);
    }
}
