package lista2Prog2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

    public static int linhas, colunas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz = new int[20][20];
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                // System.out.println("Digite os valores para preencher a matriz:");
                matriz[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Digite quantas linhas da matriz voce quer processar :");
        linhas = scanner.nextInt();
        System.out.println("Digite quantas colunas da matriz voce quer processar:");
        colunas = scanner.nextInt();
        System.out.println("O maior valor no intervalo é: " + retornamaior(matriz));
        System.out.println("O menor valor no intervalo é: " + retornamenor(matriz));
        System.out.println("A média dos valores no intervalo é: " + retornamedia(matriz));
        escrevematriz(matriz);
        System.out.println();
        escrevediagonal(matriz);
        System.out.println();
        System.out.println("desvio padrao: " + retornadesvio(matriz));
        scanner.close();
    }

    public static int retornamaior(int maior[][]) {

        int maiorvalor = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (maior[i][j] > maiorvalor) {
                    maiorvalor = maior[i][j];
                }
            }
        }
        return maiorvalor;

    }

    public static int retornamenor(int menor[][]) {

        int menorvalor = Integer.MAX_VALUE, i = 0, j = 0;
        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas; j++) {
                if (menor[i][j] < menorvalor) {
                    menorvalor = menor[i][j];
                }
            }
        }
        return menorvalor;
    }

    public static double retornamedia(int media[][]) {

        double mediatotal = 0;
        int soma = 0, i = 0, j = 0;
        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas; j++) {
                soma += media[i][j];
            }
        }
        mediatotal = soma / (linhas * colunas);
        return mediatotal;
    }

    public static void escrevematriz(int matriz[][]) {
        System.out.println("matiz digitada: ");
        for (int i = 0; i < linhas; i++) {
            System.out.print("\n");
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }

        }
    }

    public static void escrevediagonal(int matriz[][]) {
        if (colunas == linhas) {
            System.out.println("Diagonal principal:");
            for (int i = 0; i < colunas; i++) {
                System.out.print(matriz[i][i] + " ");
            }
        } else {
            System.out.println("não exixte diagonal principal.0");
        }

    }

    public static double retornadesvio(int des[][]) {
        double desviopadrao = 0;
        double somaQuadradosDiferencas = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double diferenca = des[i][j] - retornamedia(des);
                somaQuadradosDiferencas += diferenca * diferenca;
            }
        }
        desviopadrao = Math.sqrt(somaQuadradosDiferencas / 16);
        return desviopadrao;
    }

    public static void normalizamatriz(int matriz[][]) {
        
    }
}
