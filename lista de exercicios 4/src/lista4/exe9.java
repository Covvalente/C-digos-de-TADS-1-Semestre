package lista4;

import java.util.Scanner;

public class exe9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println(" Digite o tamanho dos vetores ");
		int qtd=sc.nextInt();
		int[]vetorA= new int[qtd];
		int[]vetorB= new int[qtd];
		int [] vetorC= new int [qtd];
		int ContA,ContB;
		
		for(int i = 0; i<qtd; ++i) {
			System.out.println(" Insira o " +(i+1)+"° valor do vetor A");
			vetorA[i]=sc.nextInt();
			sc.reset();
			
		}
		for (int j=0; j <qtd; ++j) {
			System.out.println(" Insira o "+(j+1)+"° valor do vetor B");
		vetorB[j] = sc.nextInt();
		sc.reset();
		
		}
		for (int m=0; m <qtd;++m) {
			vetorC[m]= vetorA[m]+vetorB[m];
			System.out.println(vetorA[m] +"+"+vetorB[m]+"="+vetorC[m]);
			
		}
	}

}
