package com.br.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe com intuito de gerenciar o jogo
 * @author Iris Souza
 */
public class Jogada {
    List<Simbolo> sorteados;
    List<Simbolo> simboloSorteados = new ArrayList<>();

    private int total;
    private int quantidadeDeSorteios;


    public Jogada() {
        this.sorteados = new ArrayList<>();
    }

    /**
     * Método para gerar os simbolos aletórios a partir dos itens do Enum
     * @author Iris Souza
     */
  public void sortear() {
      Random random = new Random();
      Simbolo[] todosOsSimbolos = Simbolo.values();
      int opcoes = todosOsSimbolos.length;

      int valorAleatorio = random.nextInt(opcoes);
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
        mostrarPontuacao();
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
     * Método para validar se o usuário vai ganhar pontos bônus ou não
     */
    public void validarBonus(){
       int acertos = 0;
        Simbolo simbolo = sorteados.get(0);

        for(Simbolo sorteado: sorteados) {
            if (simbolo.equals(sorteado)) {
                acertos++;
            }
        }

        if (acertos == sorteados.size()) {
            int bonus = 100;
            int totalComBonus = total * bonus;
            IO.mostrarTexto("Pontuação total com o Bonus: " + totalComBonus);
        } else {
            IO.mostrarTexto("Você não teve pontos bonus!");
        }
    }

    /**
     * Método para mostrar a pontuação total do usuário na jogada
     * @author Iris Souza
     */
    public void mostrarPontuacao(){
        IO.mostrarTexto("Seus pontos são: " + total);
    }
}
