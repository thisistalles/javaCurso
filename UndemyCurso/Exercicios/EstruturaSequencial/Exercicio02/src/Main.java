import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double area, raio;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais.
Fórmula da área: area = π . raio²
Considere o valor de π = 3.14159
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java
 */