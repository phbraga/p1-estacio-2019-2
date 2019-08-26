package unidade1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Condicionais {

    public static void main(String[ ] args) {

//        int a = 5, b = 6, c = 5;

        // Operador IF - ELSE IF - ELSE
//        if (a == b) {
//            System.out.println("A é  igual a B");
//        } else if (a > b){
//            System.out.println("A é Maior que B");
//        } else if (a == c) {
//            System.out.println("A é igual a C");
//        } else {
//            System.out.println("A é Menor que B");
//        }

        // Operador Ternário
//        int maior = a >= b ? a : b;
//        System.out.println(maior);

        // Operador Switch
//        int diaSemana = 5;
//        switch (diaSemana) {
//            case 0:
//            case 1:
//                System.out.println("Final de Semana");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            default:
//                System.out.println("Demais dias");
//        }

        // Instrução FOR
//        for (int i = 1 ; i <= 10 ; ++i) {
//
//            if (i % 2 == 1) {
//                continue;
//            }
//
//            System.out.println(i);
//        }
//        System.out.println("Saiu do For");

        // Instrução WHILE
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            ++i;
//        }

        // Instrução Do - WHILE
//        do {
//            System.out.println(i);
//            ++i;
//        } while (i <= 10);

        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        b = scanner.nextInt();

        if (a != 0 && b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Divisão por Zero não Permitida");
        }

    }
}