package com.br.zup;

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
