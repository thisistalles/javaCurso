import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dig;

        System.out.println("Digite a Senha");
        dig = sc.nextInt();

        while (dig != 2002) {


            System.out.println("Senha Invalida");

            System.out.println("Digite a Senha");
            dig = sc.nextInt();

        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}

/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java
*/

