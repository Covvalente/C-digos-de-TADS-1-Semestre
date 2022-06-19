package lista4;

import java.util.Scanner;

public class exe8 {
public static void main(String[]args) {
	



	        Scanner sc = new Scanner(System.in);

	        float vetor[] = {40, 33, 101, 205, 87, 7};

	        System.out.println("Digite o número que quer verificar ");
	        float N = sc.nextInt();

	        for (int i = 0; i < vetor.length; i++) {

	            if (N == vetor[i]) {
	                System.out.println("Número esta presente no vetor,\nPosição: " + (i + 1) + "°");
	                break;

	            }
	        }
	        System.out.println("Esse número não se encontra no vetor ");

	    }
	}


