import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] name = new String[10];
        String[] email = new String[10];
        int[] room = new int[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine();

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Email: ");
            email[i] = sc.next();

            System.out.print("Room: ");
            room[i] = sc.nextInt();


        }


    }


}
//testando