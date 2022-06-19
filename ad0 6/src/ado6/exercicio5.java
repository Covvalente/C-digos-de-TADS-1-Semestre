package ado6;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int result;
		int cont=0;
		
		Scanner Numero =new  Scanner(System.in);
		System.out.println("Digite o Valor do N");
		N= Numero.nextInt();
		
		do {
			
			result= N*cont;
			System.out.println(N+"x"+ cont + "="+result);
			cont++;
		}while(cont<=10);
	
		
	}
}

