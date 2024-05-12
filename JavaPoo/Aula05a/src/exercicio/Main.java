package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-Vindo ao ---TLBANK---");

        BankAccount clientec = new BankAccount(false, 0.00);
        BankAccount clientet = new BankAccount(false, 0.00);

        clientec.OpenAccount("CP", "Cleverson E.", 0.00);
        clientec.Deposit(1000.00);
        clientec.Saque(150.00);
        clientec.ClosedAccount();
        clientec.Deposit(100.00);
        clientec.Saque(150.00);
        clientec.Mensal();
        System.out.println("-------------------------------------------");
        clientet.OpenAccount("CC", "Talles R.", 0.00);
        clientet.Saque(150.00);
        clientet.ClosedAccount();


    }
}