import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] vectName = new String[n];
        int[] vectAge = new int[n];
        double[] vectHeigth = new double[n];


        double sum = 0;
        double avarage;
        double quantityAge = 0;
        double calculation;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            vectName[i] = sc.next();

            System.out.print("Idade: ");
            vectAge[i] = sc.nextInt();

            System.out.print("Altura: ");
            vectHeigth[i] = sc.nextDouble();

            if (vectAge[i] < 16) {
                quantityAge++;
            }

            sum += vectHeigth[i];
        }

        avarage = sum / n;
        calculation = (quantityAge / vectAge.length) * 100;

        System.out.printf("Altura média: %.2f%n", avarage);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", calculation);

        for (int i = 0; i < n; i++) {
            if (vectAge[i] < 16) {
                System.out.println(vectName[i]);

            }
        }
        sc.close();

    }
}
/*
 *Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 *tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 *bem como os nomes dessas pessoas caso houver.
 * Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java
 */

//obs: consultei um codigo meu para ver como fazer o print imprimir "1,2..."
//consultei o chatgpt so para saber como era a formula do "calculation"
//consultei o resultado so para ver como colocar a "%" na linha 46
