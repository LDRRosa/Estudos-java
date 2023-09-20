/*No método main, crie um circulo e um quadrado, some as duas, exiba, faça a interseção das duas e

exiba, crie uma imagem aleatória e exiba, some e faça interseção com o circulo exibindo os resulta-
dos (Use A ou B para as operações). */

package lista2Prog2;

import java.util.Random;

public class Exercicio12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] quadrado = new int[41][41];
        int[][] circulo = new int[41][41];
        int[][] intersecao = new int[41][41];
        int[][] aleatoria = new int[41][41];
        int[][] intersecao2 = new int[41][41];
        int[][] soma = new int[41][41];
        int i, j;

        for (i = 0; i < 20; i++) {
            for (j = 0; j < 20; j++) {
                quadrado[i][j] = 1;
            }

        }
        System.out.println("Quadrado:");
        for (i = 0; i < 41; i++) {
            System.out.println();
            for (j = 0; j < 41; j++) {
                System.out.print(quadrado[i][j] + " ");
            }
        }
        for (i = 0; i < 41; i++) {
            for (j = 0; j < 41; j++) {
                double distancia = Math.sqrt(Math.pow(i - 11, 2) + Math.pow(j - 11, 2));

                if (distancia <= 11) {
                    circulo[i][j] = 1;
                } else {
                    circulo[i][j] = 0;
                }
            }
        }
        System.out.print("\n================================================================");
        System.out.println("\nCirculo:");
        for (i = 0; i < 41; i++) {
            System.out.print("\n");
            for (j = 0; j < 41; j++) {
                System.out.print(circulo[i][j] + " ");
            }
        }

        for (i = 0; i < 41; i++) {
            for (j = 0; j < 41; j++) {
                if (quadrado[i][j] == circulo[i][j]) {
                    intersecao[i][j] = circulo[i][j];
                } else {
                    intersecao[i][j] = 0;
                }
            }

        }
        System.out.print("\n================================================================");
        System.out.println("\ninterceção circulo e quadrado:");
        for (i = 0; i < 41; i++) {
            System.out.println();
            for (j = 0; j < 41; j++) {
                System.out.print(intersecao[i][j] + " ");
            }

        }
        int ram = 0;
        for (i = 0; i < 41; i++) {
            ram = random.nextInt(10);
            for (j = 0; j < 41; j++) {
                if (ram < 5) {
                    aleatoria[i][j] = 1;
                } else {
                    aleatoria[i][j] = 0;
                }
            }

        }
        System.out.print("\n================================================================");
        System.out.println("\nimagem aleatória:");
        for (i = 0; i < 41; i++) {
            System.out.println();
            for (j = 0; j < 41; j++) {
                System.out.print(aleatoria[i][j] + " ");
            }
        }
        for (i = 0; i < 41; i++) {
            for (j = 0; j < 41; j++) {
                if (aleatoria[i][j] == circulo[i][j]) {
                    intersecao2[i][j] = circulo[i][j];
                } else {
                    intersecao2[i][j] = 0;
                }
            }

        }
        System.out.print("\n================================================================");
        System.out.println("\ninterceção circulo e aleatória:");
        for (i = 0; i < 41; i++) {
            System.out.println();
            for (j = 0; j < 41; j++) {
                System.out.print(intersecao2[i][j] + " ");
            }

        }
        for (i = 0; i < 41; i++) {
            for (j = 0; j < 41; j++) {
                soma[i][j] = (circulo[i][j] + aleatoria[i][j]);
            }
        }
        System.out.print("\n================================================================");
        System.out.println("\nsoma circulo + aleatória:");
        for (i = 0; i < 41; i++) {
            System.out.println();
            for (j = 0; j < 41; j++) {
                System.out.print(soma[i][j] + " ");
            }
        }
    }
}