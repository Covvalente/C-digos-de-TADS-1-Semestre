package lista4;

import java.util.Scanner;

public class exe7 {
 public static void main(String[]args) {
	 Scanner sc= new Scanner (System.in);
	 float vetor[] = {5,3,2,4,5,6};
	 float S=0;
	 System.out.println("Digite um numero para ser multiplicado pelos elemntos do vetor");
	 float N =sc.nextInt();
	 
	 for (int i=0; i<vetor.length;i++) {
		 S=N*vetor[i];
		 
		 System.out.println(vetor[i]+"X"+N+"="+S);
		 
	 }

 }
}
