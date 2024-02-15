import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String old = "";
        int idade = 0;

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");

            System.out.print("Nome: ");
            name[i] = sc.next();

            System.out.print("Idade: ");
            age[i] = sc.nextInt();

            if (age[i] > idade) {
                idade = age[i];
                old = name[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + old);

        sc.close();
    }
}
/*
 *Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
 *devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
 *da pessoa mais velha.
 *Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/mais_velho.java
 */
//Obs:melhorias tentar fazer com classe


