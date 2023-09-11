import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number, hours;
        float salary, received;

        System.out.print("Digite o número do funcionário: ");
        number = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        hours = sc.nextInt();

        System.out.print("Digite o valor recebido por hora: ");
        received = sc.nextFloat();

        salary = received * hours;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n ", salary);


        sc.close();
    }
}
/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
*/