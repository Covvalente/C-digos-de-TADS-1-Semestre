package com.Aula_Algoritmos;

import java.util.Scanner;

public class Ex_15 {
    static int funcao (int X, int Z) {
        int cont;
        int pot = 1;
        for (cont = 1; cont <= Z; cont++ ) {
            pot = pot * X;
        }
        return pot;
    }
    public static void main (String [] args){
        int X = 0;
        int Z = 0;
        int pot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da base");
        X = sc.nextInt();
        System.out.println("Insira o valor do expoente");
        Z = sc.nextInt();
        pot = funcao(X, Z);
        System.out.println("\nO valor da potência é: " +pot);
    }
}


