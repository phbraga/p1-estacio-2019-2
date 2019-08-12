package unidade1;

import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args) {
        String message = "Olá, ";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println(message + name);

    }
}
