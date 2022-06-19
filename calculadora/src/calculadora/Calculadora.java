package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b;
		String operacaoStr;
		char operacao;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("<A> adição");
			System.out.println("<B> subtração");
			System.out.println("<C> multiplicação");
			System.out.println("<D> divisão");
			System.out.println("Escolha a operação");
			
			operacaoStr = entrada.next();
			operacao = operacaoStr.charAt(0);
			
			System.out.println("1o operando");
			a= entrada.nextDouble();
			System.out.println("2o operando");
			b= entrada.nextDouble();
		}
		if ( operacao == 'a' || operacao =='A') {
			System.out.println("Soma:" + (a + b ));
		} else if (operacao == 'b' || operacao == 'B') {
			System.out.println("Diferença :" + (a - b));
		} else if (operacao == 'c' || operacao == 'C') {
			System.out.println("Produto: " + (a * b));
		} else if (operacao == 'd' || operacao == 'D' ) {
			System.out.println("Quocinete:" + (a / b));
		}	else { 
			System.out.println(" A operação" +  operacao + " não esta correta");
			
			}
		}
		
	}


