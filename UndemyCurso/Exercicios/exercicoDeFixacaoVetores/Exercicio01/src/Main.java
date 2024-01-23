import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
/*
*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
*e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
*Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
*/

//obs:usei chatgpt para ver como eu poderia mostrar os valores do array
// peguei uma fila da internet para ver a logica de como mostrar oq ta armazenado no array/os valores negativos
// a fila da internet nao me ajudou muito mas me deu um "norte";