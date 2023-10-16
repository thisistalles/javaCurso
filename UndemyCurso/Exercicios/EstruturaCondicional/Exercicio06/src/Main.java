import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float value;
        float interval1 = 0.25f;
        float interval2 = 25.50f;
        float interval3 = 50.75f;
        float interval4 = 75.100f;

        System.out.print("Enter the Value: ");
        value = sc.nextFloat();

        if (value < 0.0 || value > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (value <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (value <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (value <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
            sc.close();
        }
    }
}


/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
*/
//Novamente vi a resposta e meu amigo pegou a resposta no chatgpt para me ajudar