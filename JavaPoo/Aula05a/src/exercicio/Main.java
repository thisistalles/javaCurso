package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-Vindo ao ---TLBANK---");

        BankAccount cliente = new BankAccount(false, 0.00);

        cliente.OpenAccount("CP", "Cleverson E.", 0.00);
        cliente.Deposit(100.00);
        cliente.Saque(50.00);
        cliente.Mensal();
        cliente.ClosedAccount();


    }
}