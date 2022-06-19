package lista4;

import java.util.Scanner;

public class exe11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		float medPar=0;
		float soma=0;
		int cont=0;
		
		System.out.println("insira  tamanho do vetor que deseja ");
		int qtd = sc.nextInt();
		float[] vetorA= new float[qtd];
		
		for(int i =0; i <qtd; ++i) {
			System.out.println(" insira o "+ (i+1)+ "º valor do vetor A");
		vetorA[i]=sc.nextFloat();
		if ((i+2)%2==0) {
			soma = soma +vetorA[i];
			cont++;
		}
		}
		medPar=soma/cont;
		System.out.println(" A média dos números na posição par é :"+ medPar);
	for (int j=0; j<qtd;++j) {
		if (vetorA[j]> medPar) {
			System.out.println(" numeros presentes no vetor maiores que a média de pares:" + vetorA[j]);
		}
	}
	}

}
