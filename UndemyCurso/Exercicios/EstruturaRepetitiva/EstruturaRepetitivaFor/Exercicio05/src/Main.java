import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = 1;i<=n;i++){
            fact = fact * i;

        }
        System.out.println(fact);

        sc.close();
    }
}
/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
*/
//thisiscleverson me deu a resposta.