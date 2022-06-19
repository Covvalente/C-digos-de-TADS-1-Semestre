package com.company;

import java.util.Scanner;

public class Ex_4 {
    static int fatorial(int a) {
        int f = a;

        if (a >= 0) {
            while (a > 1) {
                f = f * (a - 1);
                a--;

                System.out.println(f);

            }
        }
        return f;
    }

    static float somatoria(int a) {
        int S = 0;
        System.out.println(a);
        //if (a >= 0) {

        for (int i = 0; i <= a; i++) {

            S = S + i;
            System.out.println(i);

        }
        return (S);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da soma ");
        int S = sc.nextInt();
        System.out.println("Digite o valor da fatorial ");
        int F = sc.nextInt();
        System.out.println("Digite o valor ");
    }
}



