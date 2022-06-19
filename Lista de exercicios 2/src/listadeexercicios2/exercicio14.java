package listadeexercicios2;

import java.util.Scanner;

public class exercicio14 {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final Scanner sc=new Scanner(System.in);
		
		float s=2;
		float d =3;
		final float contador=2;
		float result =1; {
		
			System.out.println("Digite um valor limite");
			final int N =sc.nextInt();
			while (d<N||s<N) {
				System.out.println(result);
				result=result +(s/d);
				s= contador+s;
				d= contador+d;
			}
		}
		
	}

}
