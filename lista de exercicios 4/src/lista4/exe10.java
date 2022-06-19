package lista4;

import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		float result=0;
		float soma=0;
		
		System.out.println(" Insira o tamanho do vetor que deseja ");
		int qtd=sc.nextInt();
		
		float[] vetorA= new float [qtd];
		
		System.out.println(" Digite o multiplicador dos elementos  do vetor ");
		float N= sc.nextFloat();
		for(int i=0; i<qtd;i++) {
			System.out.println("insira o"+ (i+1)+"º valor do vetor A");
		vetorA[i] = sc.nextFloat();
		if(i+1%2==1){
			System.out.println("O resultado de "+vetorA[i]+"X"+N+"="+(vetorA[i]*N));
			soma =(vetorA[i]*N);
			result = soma+ result;
			
			
		}
		sc.reset();
		
		}
		System.out.println(" o resultado final de todas as  multiplicações  é "+ result);
		sc.close();
	}

}
