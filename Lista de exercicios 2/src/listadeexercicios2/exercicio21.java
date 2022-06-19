package listadeexercicios2;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	int x, n, s, i;
		x = input.nextInt();

		while (x >= 0) {
			n = input.nextInt();
			s=0;
			for (i=1; i <= n/2; i++) {
				if (n % i == 0) {
					s+=i;
				}
			}
			if (s == n) {
				System.out.println(n + " é perfeito");
			} else {
				System.out.println(n + " não é perfeito");
			}
			x--;
	}

	}
}
