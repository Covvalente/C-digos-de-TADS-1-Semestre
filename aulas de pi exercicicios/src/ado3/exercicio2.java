package ado3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
		try (Scanner triangulo = new Scanner(System.in)) {
			System.out.println("Digite o lado a");
			a= triangulo.nextFloat();
			System.out.println("Digite o lado b");
			b= triangulo.nextFloat();
			System.out.println("Digite o lado c");
			c= triangulo.nextFloat();
		}
		if(a>=+b+c|| b>=c+a|| c>=a+b) {
			System.out.println("N�o � um tri�ngulo. ");
		}else if 
		(a==b && b==c)
			System.out.println("Tri�ngulo equilatero.");
		
			else if (a==b || b==c|| c==a)
		System.out.println("Tri�ngulo isosceles. "); 
		
			else
				System.out.println("Triangulo escaleno.");
		}
		
	}


