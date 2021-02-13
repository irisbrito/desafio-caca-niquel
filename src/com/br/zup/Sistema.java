package com.br.zup;

/**
 * Classe Sistema para criar o método de execução
 * @author Iris Souza
 */
public class Sistema {
    Jogada jogada = new Jogada();


    public Sistema(){

    }

    /**
     * Método para criação do menu e dar inicio ao jogo
     */
    public void menu(){
        IO.mostrarTexto("JOGO CAÇA NÍQUEL\n BANANA: 10 PONTOS \n MORANGO: 20 PONTOS \n ESTRELA: 40 PONTOS");
        IO.mostrarTexto("-------------------------");
        jogada.verificarDificuldade();
        jogada.gerarJogada();
        jogada.validarBonus();
    }

    /**
     * Método para execução do sistema
     */
   public void executarSistema(){
        menu();
    }
}

