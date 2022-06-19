package listadeexercicios2;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
				System.out.println("Digite um numero para fatoração");
				double N = sc.nextDouble();
				
				double f=N;
				while (N>1) {
					f=f*(N-1);
					N--;
					System.out.println(f);
				}
	}

}
