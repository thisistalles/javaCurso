import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int pares = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                pares++;

            }

        }

        System.out.println("NUMEROS PARES: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {

                System.out.print(vect[i] + "  ");
            }
        }
        System.out.println(" ");
        System.out.print("QUANTIDADE DE PARES = " + pares);

        sc.close();

    }
}
/*
 *Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 *tela todos os números pares, e também a quantidade de números pares.
 *Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/numeros_pares.java
 */

//obs: depois de ver o codigo "original" eu poderia ter colocado o  if da linha 19 no for
//da linha 28

