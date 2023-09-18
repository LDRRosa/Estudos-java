/*O departamento de turismo da prefeitura de Aracajú deseja prover informações sobre suas 15 praias.
Dados
1 - Código da praia(0 a 15)
2 - Distância do centro em km
3 - Número de veranistas da última temporada
4 - Código do tipo de estrada de acesso:
0 → não asfaltada
1 → asfaltada

Faça métodos para descobrir:
a) O praia mais distante
b) A praia mais próxima
c) A praia menos frequentada
d) o número de praias que distam mais de 15km do Centro;
e) O número de veranistas que frequentam as praias cujo acesso não é asfaltado;
f) O número de veranistas que frequentam praias cujo acesso é asfaltado;

*/
package lista2Prog2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] distancia = new int[16];
        int[] veranistas = new int[16];
        int[] estrada = new int[16];

        for (int i = 1; i < 16; i++) {
            // System.out.println("Digite a distância que a praia " + i + " se encontra:");
            distancia[i] = random.nextInt(100);
        }
        for (int i = 1; i < 16; i++) {
            // System.out.println("Digite a quantidade de turistas que a praia " + i + "
            // teve:");
            veranistas[i] = random.nextInt(200);
        }
        for (int i = 1; i < 16; i++) {
            System.out.println("Digite o tipo de estrada que leva a praia " + i + " (0) para não asfaltada (1) para asfaltada: " + i);
            estrada[i] = scanner.nextInt();
        }
        praiamaislonge(distancia);
        praiamaisperto(distancia);
        praiamaislotada(veranistas);
        praiamaisquequinze(distancia);
        numeropraiasasfaltadas(estrada);
        numeropraiassemasfalto(estrada);
        scanner.close();
    }

    public static void praiamaislonge(int distancia[]) {
        int maior = 0, pos = 0;
        for (int i = 1; i < 16; i++) {
            if (distancia[i] > maior) {
                maior = distancia[i];
                pos = i;
            }
        }
        System.out.println("A praia " + pos + " é a mais distante, sua distancia é: " + distancia[pos] + "K/M");
    }

    public static void praiamaisperto(int distancia[]) {
        int menor = Integer.MAX_VALUE, pos = 0;
        for (int i = 1; i < 16; i++) {
            if (distancia[i] < menor) {
                menor = distancia[i];
                pos = i;
            }
        }
        System.out.println("A praia " + pos + " é a menos distante, sua distancia é: " + distancia[pos] + "K/M");
    }

    public static void praiamaislotada(int veranistas[]) {
        int maior = 0, pos = 0;
        for (int i = 1; i < 16; i++) {
            if (veranistas[i] > maior) {
                maior = veranistas[i];
                pos = i;
            }
        }
        System.out.println("A praia " + pos + " é a mais frquentada, com: " + veranistas[pos] + " visitantes");
    }

    public static void praiamaisquequinze(int distancia[]) {
        int cont = 0;
        for (int i = 0; i < 16; i++) {
            if (distancia[i] > 15) {
                cont++;
            }
        }
        System.out.println(cont + " praias estão mais distantes que 15KM");
    }

    public static void numeropraiasasfaltadas(int estrada[]) {
        int quantidade = 0;
        for (int i = 0; i < 16; i++) {
            if (estrada[i] == 1) {
                quantidade += estrada[i];
            }
        }
        System.out.println(quantidade + " turistas frequentaram as praias com estradas asfaltadas");
    }

public static void numeropraiassemasfalto(int estrada[]) {
    int quantidade = 0;
        for (int i = 0; i < 16; i++) {
            if (estrada[i] == 0) {
                quantidade += estrada[i];
            }
        }
        System.out.println(quantidade + " turistas frequentaram as praias com estradas Não asfaltadas");
    }
}
