package com.br.zup;
/*
 Desafio 1 - Criar um sistema que simula um caça níquel.
 O Sistema deve gerar 3 valores aleatórios entre as opções
 Banana - 10 pontos, Morango - 20 pontos e Estrela - 40 pontos.
 Sempre que é executado os valores devem ser somados e apresentado ao usuário o valor total da pontuação
 */

/**
 * Classe principal
 * @author Iris Souza
 */
public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.executarSistema();
    }


}
