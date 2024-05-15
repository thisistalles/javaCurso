package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-Vindo ao ---TLBANK---");

        BankAccount clientec = new BankAccount();


        System.out.print("Digite o seu nome: ");
        clientec.setOwner(sc.nextLine());

        System.out.print("Digite o tipo da conta (CC/CP): ");
        clientec.setType(sc.next());

        System.out.print("Digite o valor que você deseja depositar: ");
        clientec.setBalance(sc.nextDouble());


        clientec.openAccount();
        System.out.print("Digite o valor para saque: ");
        clientec.saque(sc.nextDouble());
        clientec.mensal();
        clientec.closedAccount();


    }
}