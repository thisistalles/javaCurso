import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.print("Digite um número: ");
        number1 = sc.nextInt();


        System.out.print("Digite outro número: ");
        number2 = sc.nextInt();


        if (number1 % number2 == 0 || number2 % number1 == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não São Multiplos");
        }

        sc.close();

    }
}


/*
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/
//Tava com preguiça de pensar e vi o codigo original e descobri que tinha que usar o "||";