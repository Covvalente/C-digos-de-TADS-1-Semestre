package listadeexercicios2;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc =new Scanner(System.in);
			int num= sc.nextInt();
			
			
			for(int divisor = 1; divisor <= num; divisor++) {
				if (num % divisor!=0) {
			
				continue;
			}
				else {
					System.out.println("Divisor de " +num+":"+ divisor);
				}
	}
			

	}
}
