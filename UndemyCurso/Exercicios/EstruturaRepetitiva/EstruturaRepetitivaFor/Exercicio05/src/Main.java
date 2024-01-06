import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int cal = 0;
        int i;
        int ii = 0;
        int ant = 0;

        for (ii = 0; ii >= 4 ; ii-=1) {
            ant = ii;
        }

        for (i = 0; i < 4; i++) {
            cal = x * (ant - 1);


        }
        System.out.println(i);
        System.out.println(cal);
        System.out.println(ant);


    }
}
/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
*/
