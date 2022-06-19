package ado4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("Escreva um Numero de 1 a 7 ");
		int num = input.nextInt();
		
		switch(num) {
		case 1:
		System.out.println("Domingo");
		break;
		case 2:
			System.out.println("Segunda - Feira");
			break;
		case 3:
			System.out.println("Terça - Feira");
			break;
		case 4:
			System.out.println("Quarta - Feira");
			break;
		case 5:
			System.out.println("Quinta - Feira");
			break;
		case 6:
			System.out.println("Sexta - Feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
			
			default:
			System.out.println("Valor inválido");
			
		}
			}

}
