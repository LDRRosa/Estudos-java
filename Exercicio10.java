package lista2Prog2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite os valores para preencher a matriz A:");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("================================================================");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite os valores para preencher a matriz b:");
                B[i][j] = scanner.nextInt();
            }
        }
        System.out.println("================================================================");
        System.out.println("Interseção:");
        intersecaoImagens(A, B);

    }

    public static void intersecaoImagens(int A[][], int B[][]) {
        int[][] C = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] == B[i][j]) {
                    C[i][j] = A[i][j];
                } else {
                    C[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j]);
            }
        }
    }
}
