import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;


        System.out.print("Digite um número: ");
        x = sc.nextInt();

        for (int i = 1; i < x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        sc.close();
    }
}
/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java
*/
//Falhei e peguei a resposta do original