package com.br.zup;

/**
 * Classe Enum para guardar os tipos de Simbolos do jogo
 * @author Iris Souza
 */
public enum Simbolo {
    BANANA(10), MORANGO(20), ESTRELA(40);

    int pontos;

    Simbolo(int pontos) {
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

}
