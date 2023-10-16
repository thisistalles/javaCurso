import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float wage, tax;

        System.out.print("Qual seu sálario: R$ ");
        wage = sc.nextFloat();

        if (wage >= 0.00 && wage <= 2000.00) {
            System.out.println("Isento ");
        } else if (wage >= 2000.01 && wage <= 3000.00) {
            tax = (8.0f/100) * wage;
            System.out.printf("R$ %.2f", tax);
        } else if (wage >= 3000.01 && wage <= 4500.00) {
            tax = (18.0f / 100) * wage;
            System.out.printf("R$ %.2f", tax);
        } else if (wage >= 4500.00) {
            tax = (28.0f / 100) * wage;
            System.out.printf("R$ %.2f", tax);
        }


    }
}