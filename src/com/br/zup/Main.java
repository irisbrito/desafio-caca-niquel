package com.br.zup;
/*
 Desafio 1 - Criar um sistema que simula um caça níquel.
 O Sistema deve gerar 3 valores aleatórios entre as opções
 Banana - 10 pontos, Morango - 20 pontos e Estrela - 40 pontos.
 Sempre que é executado os valores devem ser somados e apresentado ao usuário o valor total da pontuação
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        IO.mostrarTexto("JOGO CAÇA NÍQUEL\n BANANA: 10 PONTOS \n MORANGO: 20 PONTOS \n ESTRELA: 40 PONTOS");
        Simbolo simbolos[] = Simbolo.values();
        Simbolo[] numerosEmbaralhados = new Simbolo[3];
        System.out.println(sorteio());
        System.out.println(sorteio());
    }

        private static List<Simbolo> sorteio(){
            Random random = new Random();
            int valorSorteado = random.nextInt(3);
            int segundoValorSorteado = random.nextInt(3);
            int terceiroValorSorteado = random.nextInt(3);
            Simbolo simbolo1 = Simbolo.values()[valorSorteado];
            Simbolo simbolo2 =  Simbolo.values()[segundoValorSorteado];
            Simbolo simbolo3 = Simbolo.values()[terceiroValorSorteado];
            List<Simbolo> sorteados = new ArrayList<>();
            sorteados.add(simbolo1);
            sorteados.add(simbolo2);
            sorteados.add(simbolo3);
            return sorteados;
        }



     /*  public static Simbolo getRandomSimbolo(simbolos[]) {
            Random random = new Random();
            return simbolos()[random.nextInt(simbolos().length)];
        }*/
}
