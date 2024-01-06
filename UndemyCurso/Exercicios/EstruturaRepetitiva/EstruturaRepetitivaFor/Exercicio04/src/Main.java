import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeat;
        float dividendo = 0;
        float denominador = 0;
        float divi = 0.0f;

        System.out.print("Digite o número de repetições: ");
        repeat = sc.nextInt();

        for (int i = 0; i < repeat; i++) {
            System.out.print("Digite o Dividendo: ");
            dividendo = sc.nextFloat();

            System.out.print("Digite o Denominador: ");
            denominador = sc.nextFloat();

            divi = dividendo / denominador;

            if (denominador == 0) {
                System.out.println("Divisão Impossivel");
                System.out.println(" ");
            } else {
                System.out.println(divi);
                System.out.println(" ");
            }

        }


    }
}
/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java
*/
//Obersavação: Depois que vi o codigo do professor percebi que era melhor eu so mandar executar o calculo/
// o codigo depois que o if fosse falso.