package lista4;

import java.util.Scanner;

public class exe41 {
    static int matriz(int qtdL, int qtdC) {

        Scanner sc = new Scanner(System.in);

        int matriz1[][] = new int[qtdL][qtdC];
        int maior = 0;

        for(int l = 0; l < matriz1.length; ++l) {
            for (int c = 0; c < matriz1[l].length; ++c) {
                System.out.println("\nDigite o " + (c + 1) + "º elemento da " + (l + 1) + "º linha ");
                matriz1[l][c] = sc.nextInt();

                if (matriz1[l][c] > maior) {
                    maior = matriz1[l][c];
                }
            }
        }return maior;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de linhas que deseja para a matriz");
        int qtdL = sc.nextInt();
        System.out.println("Insira a quantidade de colunas que deseja para a matriz");
        int qtdC = sc.nextInt();
        System.out.println("O maior elemento da matriz é " + matriz(qtdL, qtdC));
    }
}
