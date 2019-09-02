package lista1;

import java.util.Scanner;

public class Alturas {

    public static void main (String[] args) {
        int n = 50, qtdHomens = 0, qtdMulheres = 0;
        String sexo = "", sexoMaiorAlt = "", sexoMenorAlt = "";
        float altura, maiorAlt = 0, menorAlt = 3, somaAltHomens = 0, somaAltMulheres = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < n ; ++i) {
            do {
                System.out.print("Digite o seu sexo (M/F): ");
                sexo = scanner.next();
            } while (!sexo.equals("M") && !sexo.equals("F"));

            do {
                System.out.print("Digite sua altura (>= 0.5 e <= 2.5): ");
                altura = scanner.nextFloat();
            } while (altura < 0.5 || altura > 2.5);

            if (sexo.equals("M")) {
                ++qtdHomens;
                somaAltHomens += altura;
            } else {
                ++qtdMulheres;
                somaAltMulheres += altura;
            }

            if (maiorAlt < altura) {
                maiorAlt = altura;
                sexoMaiorAlt = sexo;
            }

            if (menorAlt > altura) {
                menorAlt = altura;
                sexoMenorAlt = sexo;
            }
        }

        float mediaAltMulheres = (qtdMulheres > 0) ? (somaAltMulheres / qtdMulheres) : 0;
        float mediaAltHomens = (qtdHomens > 0) ? (somaAltHomens / qtdHomens) : 0;

        System.out.println("A média de altura dos homens é " + mediaAltHomens);
        System.out.println("A média de altura das mulheres é " + mediaAltMulheres);

        System.out.println("A maior altura é " + maiorAlt + "(Sexo " + sexoMaiorAlt + ")");
        System.out.println("A menor altura é " + menorAlt + "(Sexo " + sexoMenorAlt + ")");
    }
}
