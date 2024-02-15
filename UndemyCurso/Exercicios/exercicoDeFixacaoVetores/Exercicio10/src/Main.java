import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        double media;
        String approved = "";

        String[] name = new String[n];
        double[] note1 = new double[n];
        double[] note2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            sc.nextLine();

            name[i] = sc.nextLine();

            note1[i] = sc.nextDouble();
            note2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            media = (note1[i] + note2[i]) / 2;
            if (media >= 6.0) {
                approved = name[i];
                System.out.println(approved);
            }
        }
        sc.close();
    }
}
/*
 *Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
 *no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
 *os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
 *igual a 6.0 (seis).
 *Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/aprovados.java
 */
//obs: usei o chatgpt para descobrir o erro do "nextline" que tava aparecendo as respostas em branco
//olhando o codigo da resposta eu poderia na linha 33 so ter colocado o "name[i" inves de criar uma var

