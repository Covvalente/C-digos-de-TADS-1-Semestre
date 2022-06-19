package listadeexercicios2;
import java.io.IOException;
import java.util.Scanner;

public class exercicio19 {
	
	public static void main(String[] args) {
		
	}
		// TODO Auto-generated method stub
	
	

		    public static void main1(String[] args) throws IOException {
		    	Scanner leitor = new Scanner(System.in);
		    	int senha = leitor.nextInt();
		    	while (senha != 2002) {
		    		System.out.println("Senha Invalida");
		        	senha = leitor.nextInt();
		    	}
				System.out.println("Acesso Permitido");
	}

}
