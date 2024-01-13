import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resposta;
        double f = 0;


        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();

            f = 9.0 * c / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);

            System.out.print("Deseja repetir (s/n)? ");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("s"));


    }
}