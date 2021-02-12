package com.br.zup;

import java.util.Scanner;

public class IO {

    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }

    public static void mostrarTexto(String texto){
        System.out.println(texto);
    }
}
