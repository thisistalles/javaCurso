import java.util.Locale;

public class Aprendizadoaula23 {
    public static void main(String[] args) {


        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%.2f%n", x); //Sintaxe: ("%.2f%n", ) ==> vai delimitar para 2 casas decimais e quebrar linha
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n ", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // %s - String/ %d int/ %f float;

    }
}