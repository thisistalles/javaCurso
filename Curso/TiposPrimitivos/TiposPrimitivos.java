package Curso.TiposPrimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();

        System.out.print("Digite a nota do aluno: ");
        float nota = input.nextFloat();

        System.out.printf("A Nota de %s é %.1f \n", nome, nota);

    }

}