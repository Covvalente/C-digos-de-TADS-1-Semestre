package listadeexercicios2;

import java.util.Scanner;

public class exercio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

          int s = 1;
          float d = 2;
          float result = 1;{
              System.out.println("Digite um valor limite ");
              int N = sc.nextInt();

              while (d < N){

                  System.out.println(result);
                  result = result - (s/d)  ;
                  d ++;


	}

}
}
}