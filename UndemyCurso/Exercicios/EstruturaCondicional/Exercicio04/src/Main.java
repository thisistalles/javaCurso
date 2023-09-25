import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startHour, endHour, time;

        System.out.print("Digite a Hora Inicial: ");
        startHour = sc.nextInt();

        System.out.print("Digite a Hora Final: ");
        endHour = sc.nextInt();

        if (startHour > endHour || startHour == endHour) {
            time = 24 - (startHour - endHour);

        } else {
            time = endHour - startHour;
        }

        System.out.println("O JOGO DUROU: " + time + " HORA(S) ");

        sc.close();
    }
}

/*
*Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
*começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/
//thiiscleverson me ajudou