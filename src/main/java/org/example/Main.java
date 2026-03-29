package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static String writeIO(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();

    }

    public static void write(String msg){
        System.out.println(msg);
    }

    public static String inverteString(String texto){
        Queue<String> fila = new LinkedList<>();

        for (char letra: texto.toCharArray()){
            pilha.push(letra);
        }
        StringBuilder saida = new StringBuilder();
        while(!pilha.isEmpty()){
            saida.append(pilha.pop().toString());
        }

        return saida.toString();
    }

    static void main() {

        String teste = writeIO("oi");
        write("oi");



    }


}
