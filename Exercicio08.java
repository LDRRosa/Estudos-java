
/* Faça um método circulo que recebe o raio, o centro do círculo, a quantidade de linhas e colunas e
umacirculo M que deve ser preenchida com * nas posições correspondentes ao círculo */
package lista2Prog2;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int raio = 0, centrox = 0, centroy = 0, linhas = 0, colunas = 0;
        System.out.println("Digite a quantodade de linhas terá a matriz: ");
        linhas = scanner.nextInt();
        System.out.println("Digite a quantodade de colunas terá matriz: ");
        colunas = scanner.nextInt();
        System.out.println("Digite a coordenada x do centro da matriz: ");
        centrox = scanner.nextInt();
        System.out.println("Digite a coordenada y do centro da matriz: ");
        centroy = scanner.nextInt();
        System.out.println("Digite o raio do circulo(não utrapassar a metade do valor de linas e colunas): ");
        raio = scanner.nextInt();

        char[][] circulo = new char[linhas][colunas];
        desenhacirculo(circulo, linhas, colunas, centrox, centroy, raio);
        scanner.close();
    }

public static void desenhacirculo(char circulo[][], int linhas, int colunas, int centrox, int centroy, int raio) {

    for (int i = 0; i <circulo.length; i++) {
        for (int j = 0; j <circulo[i].length; j++) {
            double distancia = Math.sqrt(Math.pow(i - centrox, 2) + Math.pow(j - centroy, 2));

            if (distancia <= raio) {
            circulo[i][j] = '*';
            } else {
            circulo[i][j] = ' ';
            }
        }
    }
    for (int i = 0; i< linhas;i++){
        System.out.print("\n");
        for (int j = 0; j< colunas;j++){
            System.out.print(circulo[i][j]+" ");
        }
    }
    
}
}

