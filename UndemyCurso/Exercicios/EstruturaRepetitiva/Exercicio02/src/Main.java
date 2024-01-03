import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0  ||  y == 0){
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
        }
        sc.close();
    }
}

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java
*/
//Vi a resposta
//thisiscleverson que fez