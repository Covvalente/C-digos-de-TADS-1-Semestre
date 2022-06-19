package listadeexercicios2;
import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	int N, X;
		N = input.nextInt();

		for (int i=0; i<N; i++) {
    		X = input.nextInt();
    		if (X == 0) {
    			System.out.println("Nulo");
    		}
    		else {
    		if (X % 2 == 0) {
		    	System.out.print("Par ");
    		}
    		else {
    			System.out.print("Impar ");
    		}
    		if (X > 0) {
    			System.out.println("Positivo");
    		}
    		else {
    			System.out.println("Negativo");
    		}}
    	}
    }
}
		
    		