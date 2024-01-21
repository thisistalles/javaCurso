import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        String response = sc.nextLine();

        double valueInitial = 0.00;

        if (response.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            valueInitial = sc.nextDouble();
        }

        AccountData data = new AccountData(number, name, valueInitial);
        System.out.println("Account data: ");
        System.out.println("Account " + data);

        System.out.print("Enter a deposit value: ");
        double balance = sc.nextDouble();
        data.setBalance(balance);

        System.out.println("Updated account data: ");
        System.out.println("Account " + data);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        data.withdraw(withdraw);

        System.out.println("Updated account data: ");
        System.out.println("Account " + data);


        sc.close();
    }
}

