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

    public static void write(String msg) {
        System.out.println(msg);
    }


    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Queue<String> filaP = new LinkedList<>();
        int op, aux = 2;
        do {
            System.out.println("### Gestor de paginas web");
            System.out.println("1) Retirar senha comum.");
            System.out.println("2) Retirar senha preferencial.");
            System.out.println("3) Chamar próximo a ser atendido.");
            op = Integer.valueOf(writeIO("4) - SAir"));

            switch (op) {
                case 1:

                    if (!fila.isEmpty()) {
                        Integer ultimoInt;
                        String pegaUltimo = ((LinkedList<String>) fila).getLast();
                        ultimoInt = Integer.valueOf(Integer.parseInt(pegaUltimo));
                        ultimoInt += 1;
                        fila.add(ultimoInt.toString());
                        write("a sua senha é: " + ultimoInt.toString());
                    } else {
                        fila.add("1");
                    }
                    write(fila.toString());
                    break;
                case 2:
                    if (!filaP.isEmpty()) {
                        Integer ultimoInt;
                        String pegaUltimo = ((LinkedList<String>) filaP).getLast();
                        ultimoInt = Integer.valueOf(Integer.parseInt(pegaUltimo));
                        ultimoInt += 1;
                        filaP.add(ultimoInt.toString());
                        write("a sua senha é: " + ultimoInt.toString());
                    } else {
                        filaP.add("1");
                    }
                    write(filaP.toString());
                    break;
                case 3:
                    if (!filaP.isEmpty()) {
                        if (aux > 0) {
                            write("o senha prefencial é: " + fila.poll());
                            write(filaP.toString());
                            aux--;
                        } else {
                            write("o senha comum é: " + fila.poll());
                            write(fila.toString());
                            aux = 2;
                        }
                    }
                    break;
            }
        }
        while (op != 4);


    }


}
