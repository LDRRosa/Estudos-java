package lista2Prog2;
//Tenho que terminar(não funciona!!)
import java.util.Scanner;

public class Exercicio04TEMQUEACABR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[63][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite os numeros para preencher a matriz: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < calculohistograma(matriz).length; i++) {
            System.out.printf("%d: %d%n",  i, calculohistograma(matriz)[i]);
        }
        scanner.close();
    }

    public static int[] calculohistograma(int matriz[][]) {
        int valormaximo = 63;
        int[] histograma = new int[3 + 1];
        int valorMaisFrequente = -1;
        int maxFrequencia = 0;

        for (int i = 0; i < valormaximo; i++) {
            for (int j = 0; j < valormaximo; j++) {
                int valor = matriz[i][j];
                if (valor >= 0 && valor <= valormaximo) {
                    histograma[valor]++;
                    if (histograma[valor] > maxFrequencia) {
                        maxFrequencia = histograma[valor];
                        valorMaisFrequente = valor;
                    }
                }
            }
        }
        return histograma;

    }
}
