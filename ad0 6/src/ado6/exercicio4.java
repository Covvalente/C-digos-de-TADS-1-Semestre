package ado6;

import java.util.Scanner;

public class exercicio4 {
	public static void main(final String[] args) {
		final Scanner Input = new Scanner(System.in);
		
		
		int contador =0;	
		int somapositivo=0;
		int contadorpositivo=0;
		float media=0;
		
			final Scanner input = new Scanner (System.in)	;
			
		while (contador <6) {
		System.out.println(" Digite um valor ");
		final int valor = Input.nextInt();
			
			
			if (valor>0) {
		somapositivo = valor;
		contadorpositivo ++ ;
		media=(float) somapositivo/ contadorpositivo;
			}
		contador ++;
		
	}
System.out.println(somapositivo);		
System.out.println(contadorpositivo);
System.out.println(media);
}
}