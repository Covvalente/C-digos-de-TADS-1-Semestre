package com.Aula_Algoritmos;

import java.util.Scanner;

public class Ex_5 {
    static double raiz(double a, double b, double c) {

        double x1 = 0;
        double x2 = 0;
        double delta;

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            x1 = (b + Math.sqrt(delta)) / (2 * a);
            System.out.println("A raiz com o sinal de + é: " + x1);
            x2 = (b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A raiz com o sinal de - é: " + x2);

        }
        if (x1 > x2) {

            System.out.println("A maior raiz é : " + x1);

        } else if (x2 > x1) {

            System.out.println("A maior raiz é : " + x2);

        } else if (x2 % 2 == 0 && x1 % 2 == 0) {
            System.out.println("Não há raízes reais: " + -1);

        }return (delta);
    }

    public static void main (String args[]) {

    Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double N = ler.nextDouble();
        System.out.println(" Digite o valor de b:");
        double C = ler.nextDouble();
        System.out.println(" Digite o valor de  c: ");
        double D = ler.nextDouble();

        System.out.println("Delta: " + raiz(N, C, D));

    }
}

