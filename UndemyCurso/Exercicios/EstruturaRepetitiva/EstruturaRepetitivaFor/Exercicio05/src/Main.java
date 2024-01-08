import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int xx;

        System.out.print("Digite o valor: ");
        xx = sc.nextInt();

        System.out.print("Digite o valor: ");
        n = sc.nextInt();


        for(int i = 0; i<xx;i++){

            System.out.println("teste");
            int x = sc.nextInt();

            n = n*(x-1);
            x = x-2;
            n = n *x;

            System.out.println(n);
        }






    }
}
/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
*/
//codigo incompleto
//em fase de construção