 package apple;

import java.util.Arrays;
import java.util.Random;

public class codigo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] v= gerarVetor(15);
	System.out.println(Arrays.toString(v));
	
	}
			private static int[] gerarVetor(int	 tam) {
			int []vetor= new int [tam];
			
			Random gerador=new Random();
			
			for (int i=0; i<vetor.length;i++) {
				vetor[i] = gerador.nextInt(10);
				for(int j=0; j<vetor.length; j++) {
					
				 {
						
					}
				}
			}
			
			return vetor;
			
					
		}
	
	}


