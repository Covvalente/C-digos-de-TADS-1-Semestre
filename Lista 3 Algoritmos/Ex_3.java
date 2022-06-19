package com.company;

import java.util.Scanner;

public class Ex_3 {
    static int fatorial(int a) {

        int f = a;

        if (a >= 0) {
            while (a > 1) {
                f = f * (a - 1);
                a--;

            }
        }
        return f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da fatorial ");
        int F = sc.nextInt();
        System.out.println("A soma dos número é: " + fatorial(F));
    }
}