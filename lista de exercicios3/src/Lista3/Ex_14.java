package com.Aula_Algoritmos;

import java.util.Scanner;

public class Ex_14 {
    static float soma(float A, float N) {

        float i;
        float S = A;

        for (i = 1; i < N; i++) {

            S = S + 1;
            A = A + S ;

        }
        return A;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A ");
        int A = sc.nextInt();
        System.out.println("Digite o valor de N ");
        int N = sc.nextInt();
        System.out.println("A soma dos " + N + " próximos números depois de " + A + " é: " + soma(A, N));

    }
}