import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numbers = 0;
        double smaller = 10, larger = 0, quantity = 0, woman = 0, average = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] gender = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = sc.nextDouble();

            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            gender[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {

            if (altura[i] < smaller) {
                smaller = altura[i];
            }

            if (altura[i] > larger) {
                larger = altura[i];
            }

            if (gender[i] == 'F') {
                quantity++;
                woman += altura[i];
                average = woman / quantity;
            }

            if (gender[i] == 'M') {
                numbers++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", smaller);
        System.out.printf("Maior altuta = %.2f%n", larger);
        System.out.printf("Media das alturas das mulheres = %.2f%n", average);
        System.out.println("Numero de homens = " + numbers);

        sc.close();
    }
}
/*
 *Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
 *que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
 *de homens.
 *Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/dados_pessoas.java
 */

