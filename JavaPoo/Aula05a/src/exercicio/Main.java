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

        clientec.openAccount("CC", "Cleverson E.", 0.00);
        clientec.saque(34.00);
        clientec.mensal();
        System.out.println("-------------------------------------------");
        clientet.openAccount("CP", "Talles R.", 0.00);
        clientet.saque(131.00);
        clientet.mensal();

    }
}