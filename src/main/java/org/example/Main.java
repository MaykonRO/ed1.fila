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


    static void main() {
        Queue<String> fila = new LinkedList<>();
        Integer op;
        do {
            System.out.println("### Gestor de paginas web");
            System.out.println("1) Retirar senha comum.");
            System.out.println("2) Retirar senha preferencial.");
            System.out.println("3) Chamar próximo a ser atendido.");
            op = Integer.parseInt(writeIO("4) - SAir"));

            switch (op) {
                case 1:

                    if (!fila.isEmpty()){
                        Integer ultimoInt;
                        String pegaUltimo = ((LinkedList<String>) fila).getLast();
                        ultimoInt = Integer.parseInt(pegaUltimo);
                        ultimoInt += 1;
                        fila.add(ultimoInt.toString());
                        write("a sua senha é: "+ultimoInt.toString());
                    }
                    else {
                        fila.add("1");
                    }
                    write(fila.toString());
//                    writeIO("sua senha é: ");
                    break;
                case 2:
                    //System.out.println("Ultima pagina adicionada: ");
                    //System.out.println(historico.isEmpty() ? "Historico vazio" : historico.peek());
                    write("abcv");
                    break;
                case 3:
                    write("o numero chamado é: " + fila.poll());
                    write(fila.toString());
                    break;
            }


        }
        while (op != 4);


    }


}
