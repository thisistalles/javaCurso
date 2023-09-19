import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("NEGATIVO");

        } else
            System.out.println("NÃO NEGATIVO");


    }
}
/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
*/
//obs: tive ajuda de thisiscleverson de como eu faria para identificar se o número era negativo na questão de teria
//que fazer "n<0";
