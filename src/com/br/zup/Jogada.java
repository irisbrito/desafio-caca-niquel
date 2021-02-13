package com.br.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe com intuito de gerenciar o jogo
 * @author Iris Souza
 */
public class Jogada {
    private Simbolo simbolo;
    List<Simbolo> sorteados = new ArrayList<>();

    private int opcoes;
    private int valorAleatorio;
    private int total;
    private int quantidadeDeSorteios;
    private int bonus;

    /**
     * Método para gerar os simbolos aletórios a partir dos itens do Enum
     * @author Iris Souza
     */
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

    /**
     *  Método que dá inicio a partida do jogo
     * @author Iris Souza
     */
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

    /**
     * Método que valida o nível de dificuldade do jogo indicado pelo usuário
     * @author Íris Souza
     */
    public void verificarDificuldade(){
        IO.mostrarTexto("Caso queira aumentar a dificuldade digite um número maior que 3");
        quantidadeDeSorteios = IO.criarScanner().nextInt();
    }

    /**
     * Método para calcular a pontuação total do usuário na jogada
     * @author Iris Souza
     */
    public void calcularPontuacao(){
        IO.mostrarTexto("O seu total de pontos é: " + total);
    }
}
