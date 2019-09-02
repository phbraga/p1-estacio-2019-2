package lista1;

import java.util.Scanner;

public class Recomendacao {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        float media;
        int n;

        do {
            System.out.print("Digite a quantidade de alunos (deve ser > 0): ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 0 ; i < n ; ++i) {
            do {
                System.out.print("Digite sua média (deve ser >= 0): ");
                media = scanner.nextFloat();
            } while (media < 0);

            if (media >= 9) {
                System.out.println("Altamente Recomendado");
            } else if (media >= 8) {
                System.out.println("Fortemente Recomendado");
            } else if (media >= 7) {
                System.out.println("Recomendado");
            } else {
                System.out.println("Não Recomendado");
            }
        }
    }
}
