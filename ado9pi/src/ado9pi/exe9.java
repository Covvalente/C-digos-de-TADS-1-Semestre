package ado9pi;

import java.util.Scanner;

public class exe9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        int a = 1, b = 0, x = 1;
		        float equa = 0;
		        int max,min;

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Digite o valor minimo ");
		        min = sc.nextInt();
		        System.out.println("Digite o valor maximo ");
		        max = sc.nextInt();

		        if (a != 0 ) {
		            a = (int) (Math.random() * (max - (-min)) + (-min));
		            System.out.println("O valor de a é : " + a);

		            b = (int) (Math.random() * (max - (-min)) + (-min));
		            System.out.println("O valor de b é : " + b);

		            equa = (a * x) + b ;

		            System.out.println("O resultado da equação foi: " + equa);
		        }
		    }
		
	}


