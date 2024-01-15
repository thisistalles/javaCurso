import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println("Employee: " + employee.name + ", " + employee.NetSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.printf("Updated data: ", employee.name, ", ", employee.GrossSalary);

        sc.close();
    }
}

/*
 *Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
 *Em seguida, mostrar os dados do funcionário (nome e salário líquido).
 *Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada
 *(somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
 *Use a classe projetada abaixo.
 */
