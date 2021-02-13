package com.br.zup;

import java.util.Scanner;

/**
 * Classe Input e Output - para entrada e saída de dados
 * @author Iris Souza
 */
public class IO {
    /**
     * Método para criar Scanner e receber dados enviados pelo usuário
     * @return Scanner
     */
    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }

    /**
     * Método para saída de dados e mostrar mensagem ao usuário
     * @param texto
     */
    public static void mostrarTexto(String texto){
        System.out.println(texto);
    }
}
