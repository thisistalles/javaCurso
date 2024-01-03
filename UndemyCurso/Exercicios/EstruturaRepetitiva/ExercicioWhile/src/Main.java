import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dig;

        System.out.println("Digite a Senha");
        dig = sc.nextInt();

        while (dig != 2002) {


            System.out.println("Acesso invalido");

            System.out.println("Digite a Senha");
            dig = sc.nextInt();

        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}