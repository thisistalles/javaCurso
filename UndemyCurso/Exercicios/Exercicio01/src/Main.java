import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Entrada ");
        System.out.println("Digite o Primeiro Número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o Segundo Número: ");
        n2 = sc.nextInt();
        soma = n1 + n2;
        System.out.println("Saída ");
        System.out.println("A soma de " + n1 + " + " + n2 + " = " + soma);

        sc.close();
    }
}

/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa.
 */