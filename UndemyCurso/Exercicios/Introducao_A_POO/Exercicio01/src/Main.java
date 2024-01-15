import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        double area = rectangle.Area();
        double perimeter = rectangle.Perimeter();
        double diagonal = rectangle.Diagonal();

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PERIMETER = %.2f%n", perimeter);
        System.out.printf("DIAGONAL = %.2f%n", diagonal);


    }
}

/*Fazer um programa para ler os valores da largura e altura de um retângulo.
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar
 * uma classe como mostrado no projeto ao lado.
 */
//Observações: tive ajuda do chatgpt só para saber se