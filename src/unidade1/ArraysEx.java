package unidade1;

import java.awt.*;
import java.util.Scanner;

public class ArraysEx {

    public static void main (String[] args) {
        int mat1[][] = new int[2][2];
        int mat2[][] = new int[2][2];
        int mat3[][] = new int[2][2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < mat1.length ; ++i) {
            for (int j = 0 ; j < mat1[0].length ; ++j) {
                System.out.print("Digite o valor (" + i + ", " + j + ") para mat1: ");
                mat1[i][j] = scanner.nextInt();
                System.out.print("Digite o valor (" + i + ", " + j + ") para mat2: ");
                mat2[i][j] = scanner.nextInt();

                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0 ; i < mat3.length ; ++i) {
            for (int j = 0 ; j < mat3[0].length ; ++j) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
