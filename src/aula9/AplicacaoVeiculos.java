package aula9;

import java.util.Scanner;

public class AplicacaoVeiculos {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quilos, velocMax; // Demais variaveis de Veiculo
        float preco; // Demais variaveis de Veiculo
        int numCilindros, potencia; // Motor do veículo

        int toneladas, alturaMax, comprimento; // Variaveis do Caminhao
        float desconto; // Desconto do caminhão

        do {
            System.out.print("Digite o peso (kg) do veículo:");
            quilos = scanner.nextInt();
        } while (quilos < 0);

        do {
            System.out.print("Digite a velocidade maxima do veículo:");
            velocMax = scanner.nextInt();
        } while (velocMax < 0);

        do {
            System.out.print("Digite o preço do veículo:");
            preco = scanner.nextFloat();
        } while (preco < 0);

        System.out.print("Digite o numero de cilindros do motor veículo:");
        numCilindros = scanner.nextInt();

        System.out.print("Digite a potencia do motor veículo:");
        potencia = scanner.nextInt();

        System.out.print("Digite as toneladas do caminhão:");
        toneladas = scanner.nextInt();

        System.out.print("Digite a altura maxima do caminhão:");
        alturaMax = scanner.nextInt();

        System.out.print("Digite o comprimento do caminhão:");
        comprimento = scanner.nextInt();

        if (comprimento < 20) {
            desconto = 0.10F;
        } else if (comprimento < 30) {
            desconto = 0.15F;
        } else {
            desconto = 0.20F;
        }

        Motor m1 = new Motor(numCilindros, potencia);
        Caminhao c1 = new Caminhao(quilos, velocMax, preco, m1,
                toneladas, alturaMax, comprimento, desconto);

        imprime(c1);
    }

    public static void imprime (Veiculo v) {
        System.out.println("Quilo: " + v.getQuilos());
        System.out.println("Velocidade Max: " + v.getVelocMax());
        System.out.println("Preco: " + v.getPreco());
        System.out.println("Motor (potencia: " + v.getMotor().getPotencia() +
                ", numCilindros: " + v.getMotor().getNumCilindros() + ")");

        if (v instanceof Caminhao) {
            System.out.println("Toneladas: " + ((Caminhao) v).getToneladas());
            System.out.println("Altura Max: " + ((Caminhao) v).getAlturaMax());
            System.out.println("Comprimento: " + ((Caminhao) v).getComprimento());
            System.out.println("Desconto: " + (((Caminhao) v).getDesconto() * 100) + "%%");
            System.out.println("Preco Final: " + ((Caminhao) v).calculaPrecoFinal());
        } else if (v instanceof CarroPasseio) {
            System.out.println("Cor: " + ((CarroPasseio) v).getCor());
            System.out.println("Modelo: " + ((CarroPasseio) v).getModelo());
        }
    }
}
