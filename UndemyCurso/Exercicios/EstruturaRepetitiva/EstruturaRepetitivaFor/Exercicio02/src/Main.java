import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repetition, number;
        String results;
        String in = " in";
        String out = " out";

        System.out.print("Digite a quantidade de repetições: ");
        repetition = sc.nextInt();

        for (int i = 0; i < repetition; i++) {

            System.out.print("Digite um valor: ");
            number = sc.nextInt();

            if (number >= 10 && number <= 20) {
                results = number + in;
            } else {
                results = number + out;
            }
            System.out.println(results);

        }

        sc.close();

    }
}

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1072.java
*/
//olhando o codigo do professor da para fazer muitas melhorias mas irei deixar assim porque foi como consegui fazer
//so para deixar de recordaçã
//obs: na vdd o codigo era para dizer o total de in e out 🤡
