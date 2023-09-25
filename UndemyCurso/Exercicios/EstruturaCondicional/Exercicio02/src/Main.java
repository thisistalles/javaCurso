import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();

    }
}

/*
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
*/
