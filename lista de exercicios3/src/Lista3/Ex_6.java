package com.Aula_Algoritmos;

import java.util.Scanner;

public class Ex_6 {
        static double raiz(double a, double b, double c, int d) {

            double x1 = 0;
            double x2 = 0;
            double delta;

            delta = b * b - 4 * a * c;

            if (delta > 0) {
                x1 = (b + Math.sqrt(delta)) / (2 * a);
                System.out.println("A raiz com o sinal de + é: " + x1);
                x2 = (b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A raiz com o sinal de - é: " + x2);
                if (d == 1 && x1 > x2) {

                    System.out.println("Maior raiz é: " +x1);

                } else if (d == 1 && x2 > x1) {

                    System.out.println("Maior raiz é: " + x2);

                } else if (d == 2 && x1 < x2) {

                    System.out.println("Menor raiz é: " + x1);

                } else if (d == 2 && x2 < x1) {

                    System.out.println("Menor raiz é: " + x2);

                } else if (x2 % 2 == 0 && x1 % 2 == 0) {
                    System.out.println("Não há raízes reais: " + -1);

                }
            }
            return (delta);
        }


        public static void main(String args[]) {

            Scanner ler = new Scanner(System.in);

            System.out.println("Digite o valor de a:");
            double A = ler.nextDouble();
            System.out.println(" Digite o valor de b:");
            double B = ler.nextDouble();
            System.out.println(" Digite o valor de  c: ");
            double C = ler.nextDouble();

            System.out.println("Selecione qual raiz você quer imprimir: ");
            System.out.println("[1] Maior \n[2] Menor ");
            int D = ler.nextInt();
            System.out.println("Delta: " + raiz(A, B, C, D));

        }
    }







