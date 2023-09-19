package lista2Prog2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio04 {

    public static int linhas, colunas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o número de linhas da matriz: ");
        linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz: ");
        colunas = scanner.nextInt();

        
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                // System.out.println("digite os números para preencer a matriz: ");
                matriz[i][j] = random.nextInt(50);
            }
        }
        System.out.println();
        System.out.println("matriz inserida:");
        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%3d",matriz[i][j]);
            }
        }
        scanner.close();
        System.out.println("\n================================================================");
        System.out.println("histograma:");
        calculaHistograma(matriz, linhas, colunas);
    }

    public static void calculaHistograma(int[][] matriz, int linhas, int colunas) {
        int valmax = 63; // O intervalo válido é de 0 a 63
        int[] histograma = new int[valmax + 1];
        int valmais = -1;
        int maxfrequencia = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int valor = matriz[i][j];
                if (valor >= 0 && valor <= valmax) {
                    histograma[valor]++;
                    if (histograma[valor] > maxfrequencia) {
                        maxfrequencia = histograma[valor];
                        valmais = valor;
                    }
                }
            }
        }
        for (int i = 0; i < 63; i++) {
            System.out.printf("%d: %d%n", i, histograma[i]);
        }
        System.out.println("Valor mais frequente: "+valmais);
    }
}
