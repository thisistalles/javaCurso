import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value;
        String day = "";

        System.out.print("Digite um dia da semana: ");
        value = sc.nextInt();

        switch (value) {

            case 1:
                day = "Domingo";
                break;
            case 2:
                day = "Segunda-Feira";
                break;
            case 3:
                day = "Terça-Feira";
                break;
            case 4:
                day = "Quarta-Feira";
                break;
            case 5:
                day = "Quinta-Feira";
                break;
            case 6:
                day = "Sexta-Feira";
                break;
            case 7:
                day = "Sabado";
                break;
            default:
                day = "Valor invalido";

        }
        System.out.print("Dia da Semana: " + day);


    }
}

/*
Problema exemplo
Fazer um programa para ler um valor inteiro de 1 a 7 representando um
dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
Escrever na tela o dia da semana correspondente, conforme exemplos.
*/