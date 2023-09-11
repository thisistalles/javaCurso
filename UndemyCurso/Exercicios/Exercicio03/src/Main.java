import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o Segundo número: ");
        b = sc.nextInt();
        System.out.print("Digite o Terceiro número: ");
        c = sc.nextInt();
        System.out.print("Digite o Quarto número: ");
        d = sc.nextInt();

        diferenca = a * b - c * d;

        System.out.println("DIFERENÇA = " + diferenca);

        sc.close();
    }
}

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
 */

