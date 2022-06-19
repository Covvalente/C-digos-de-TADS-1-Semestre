package listadeexercicios2;

import java.util.Scanner;

public class exercicio3 {
public static void main(String [] args ) {	
	
	
	int valorMaior=0;
	int numerosdigitados;
	int arrayvalores[];
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Este Programa recebe os numeros inteiros positivos");
	System.out.println(" Informe quantos numeros quer digitar : ");
	numerosdigitados=sc.nextInt();
	
	arrayvalores= new int [numerosdigitados];
	for (int i=0 ;i <numerosdigitados; i++) {
		
		System.out.println("informe o" + (i+1 )+ "º valor  e aperte  enter para continuar:");
		arrayvalores[i] =sc.nextInt();
		
		valorMaior = arrayvalores[i];
		
	}
	
	for (int i=0 ;i <numerosdigitados; i++) {
		if(arrayvalores[i] > valorMaior) {
			valorMaior = arrayvalores[i];
		}
		
		System.out.println(" valorMaior: "+ valorMaior);
	}
}
	 
}
