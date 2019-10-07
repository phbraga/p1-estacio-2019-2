package av1;

import java.util.Scanner;

public class AplicacaoInvestimento {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        float capital, tx_juros_mensal, aliquota;
        int tempo, op;

        do {
            do {
                System.out.print("Informe o valor do capital: ");
                capital = scanner.nextFloat();
            } while (capital <= 0);

            do {
                System.out.print("Informe o a taxa de juros mensal: ");
                tx_juros_mensal = scanner.nextFloat();
            } while (tx_juros_mensal <= 0);

            do {
                System.out.print("Informe o tempo de aplicação (em meses): ");
                tempo = scanner.nextInt();
            } while (tempo <= 0);

            if (tempo < 6) {
                aliquota = 22.5F;
            } else if (tempo < 12) {
                aliquota = 20.0F;
            } else if (tempo <= 23) {
                aliquota = 17.5F;
            } else {
                aliquota = 15.0F;
            }

            Investimento inv1 = new Investimento();
            inv1.setTx_juros_mensal(tx_juros_mensal);
            inv1.setAliquota(aliquota);
            inv1.setMontante(inv1.calculaMontante(tempo, capital));
            inv1.setJuros_ir(inv1.calculaJIR(inv1.calculaJuros()));

            imprime(inv1);

            System.out.print("Deseja criar um novo Investimento? (1- sim / 2-não): ");
            op = scanner.nextInt();

        } while (op == 1);
    }

    public static void imprime (Investimento i) {
        System.out.println("Montante: " + i.getMontante());
        System.out.println("Juros: " + i.calculaJuros());
        System.out.println("Juros com Incidencia de IRget: " + i.getJuros_ir());
    }
}
