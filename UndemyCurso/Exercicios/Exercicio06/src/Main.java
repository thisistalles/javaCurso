import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double tri, cir, tra, qua, ret;
        double pi = 3.14159;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        c = sc.nextDouble();

        tri = (a * c) / 2;
        cir = pi * c * c;
        tra = (a+b)*c/2;
        qua = Math.pow(b,2);
        ret = a*b;

        System.out.printf("TRIANGULO: %.3f%n", tri);
        System.out.printf("CIRCULO:   %.3f%n", cir);
        System.out.printf("TRAPEZIO:  %.3f%n", tra);
        System.out.printf("QUADRADO:  %.3f%n", qua);
        System.out.printf("RETANGULO: %.3f%n", ret);

            sc.close();

    }
}
/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
*/