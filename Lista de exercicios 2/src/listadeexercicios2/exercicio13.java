package listadeexercicios2;

import java.util.Scanner;

public class exercicio13 {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final Scanner sc=new Scanner (System.in);
		
		int t =1;
		int s= 2;
		float u = 1;
		float d=3;
		float result=1;
		final float contador=2;
		
		System.out.println("Digite um valor Limite");
		final int N= sc.nextInt();
		
		{
			while (d<N||s<N) {
				
				System.out.println("result");
				result = (t*s) / (u*d);
				d= contador+d;
				u=contador+u;
				s++;
				t++;
			}
		}
	}

}
