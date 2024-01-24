import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;
        double average = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");

            sum += vect[i];

        }
        average = sum / vect.length;

        System.out.println(" ");
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", average);

        sc.close();
    }
}
/*
 *Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
 *e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 *Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
 */
//obs: achei esse mais facil do que o "exercicio01"
//vim para o "local" aproveitei e fiz esse exercicio, nao demorei muito
//depois de ver o resultado do exercicio corrigido mudei so o "average" que tava dentro do for
// e coloquei fora depois de ver o resultado
