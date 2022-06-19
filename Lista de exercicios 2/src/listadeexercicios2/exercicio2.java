package listadeexercicios2;

import java.util.Scanner;

public class exercicio2 {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int numero = 1;
			int soma = 0;
			int n;
			Scanner entrada = new Scanner(System.in);

			System.out.println("Digite um numero");
				n=entrada.nextInt();
				
				while (numero<=n) {
					soma = soma + numero;
					numero=numero+1;
					
				}
				System.out.println(soma);
		}

	}

