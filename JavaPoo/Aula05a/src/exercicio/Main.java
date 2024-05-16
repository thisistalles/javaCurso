package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-Vindo ao ---TLBANK---");

        BankAccount cliente = new BankAccount();

        int i = 0;

        do {
            cliente.menu();
            i = sc.nextInt();
            System.out.println("----");

            switch (i) {
                case 1:
                    sc.nextLine();
                    System.out.print("Digite o seu nome: ");
                    cliente.setOwner(sc.nextLine());

                    System.out.print("Digite o tipo da conta (CC/CP): ");
                    cliente.setType(sc.next());

                    System.out.println("----");
                    cliente.openAccount();
                    System.out.println("----");

                    break;
                case 2:
                    System.out.println("----");
                    System.out.print("Digite o valor para deposito: ");
                    cliente.deposit(sc.nextDouble());
                    System.out.println("---");
                    break;
                case 3:
                    System.out.println("----");
                    System.out.print("Digite o valor para saque: ");
                    cliente.saque(sc.nextDouble());
                    System.out.println("---");
                    break;
                case 4:
                    System.out.println("----");
                    cliente.mensal();
                    System.out.println("---");
                    break;
                case 5:
                    System.out.println("----");
                    cliente.closedAccount();
                    System.out.println("---");
                    break;
                case 6:
                    System.out.println("----");
                    System.out.println("Fechando menu...");
                    System.out.println("---");
                    break;
                default:
                    System.out.println("----");
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("---");

            }


        } while (i != 6);

    }
}