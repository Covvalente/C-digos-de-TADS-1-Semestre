package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b;
		String operacaoStr;
		char operacao;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("<A> adi��o");
			System.out.println("<B> subtra��o");
			System.out.println("<C> multiplica��o");
			System.out.println("<D> divis�o");
			System.out.println("Escolha a opera��o");
			
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
			System.out.println("Diferen�a :" + (a - b));
		} else if (operacao == 'c' || operacao == 'C') {
			System.out.println("Produto: " + (a * b));
		} else if (operacao == 'd' || operacao == 'D' ) {
			System.out.println("Quocinete:" + (a / b));
		}	else { 
			System.out.println(" A opera��o" +  operacao + " n�o esta correta");
			
			}
		}
		
	}


