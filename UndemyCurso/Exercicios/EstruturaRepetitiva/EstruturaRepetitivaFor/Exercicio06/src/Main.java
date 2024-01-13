import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }

        }
    }
}
/*
Ler um número inteiro N e calcular todos os seus divisores.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1157.java
*/
//thisiscleverson que me ajudou/guiou/deu a resposta para eu fazer