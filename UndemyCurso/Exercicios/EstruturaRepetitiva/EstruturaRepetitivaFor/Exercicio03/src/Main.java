import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int input;
        float value1 = 0;
        float value2 = 0;
        float value3 = 0;
        float calculation = 0;

        System.out.print("Digite o Número de Repetições: ");
        input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.print("Digite o primeiro Valor: ");
            value1 = sc.nextFloat();

            System.out.print("Digite o segundo Valor: ");
            value2 = sc.nextFloat();

            System.out.print("Digite o terceiro Valor: ");
            value3 = sc.nextFloat();

            calculation = (value1 * 2 + value2 * 3 + value3 * 5) / 10;

            System.out.printf("%.1f%n", calculation);
        }

        sc.close();
    }
}

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1079.java
*/
//usei o chatgpt para reaprender o printf, e ver uma coisa que tava dando errado no codigo mas resolvi só
