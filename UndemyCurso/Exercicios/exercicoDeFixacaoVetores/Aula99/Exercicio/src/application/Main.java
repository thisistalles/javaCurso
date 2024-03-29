package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        List<Integer> id    =   new ArrayList<>();
        List<String> name   =   new ArrayList<>();
        List<Double> salary =   new ArrayList<>();



        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print("Id: ");
            emp.id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            emp.name = sc.nextLine();

            System.out.print("Salary: " );

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idd = sc.nextInt();
        id.indexOf(idd);

        System.out.print("Enter the percentage: ");
        emp.increaseSalary(sc.nextDouble());













    }
}