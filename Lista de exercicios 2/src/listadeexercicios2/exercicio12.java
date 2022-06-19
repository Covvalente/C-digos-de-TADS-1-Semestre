package listadeexercicios2;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int s = 1 ;
	        float d = 0;
	        float result = 0;{
	            System.out.println("Digite um valor para N ");
	            int N = sc.nextInt();

	            while (d > -10){

	                System.out.println(result);
	                result =result + (s/(N-d));
	                d --;
	                s ++;
	}

}
	}
}
