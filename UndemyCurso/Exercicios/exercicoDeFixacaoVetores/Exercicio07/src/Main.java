import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double average, down;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        average = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

            average += vect[i] / vect.length;

        }
        System.out.printf(" MEDIA DO VETOR = %.3f%n ", average);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < average) {
                down = vect[i];
                System.out.println(down);
            }
        }

        sc.close();
    }
}

/*
 *Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
 *mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
 *os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 *Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/abaixo_da_media.java
 */


