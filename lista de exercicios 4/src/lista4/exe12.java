package lista4;

import java.util.Scanner;

public class exe12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

float somaA=0, mediaA=0 , somaB=0,mediaB=0;
System.out.println(" insira o tamanho que deseja para os vetores");
int qtd = sc.nextInt();

float [] vetorA= new float[qtd];
float[] vetorB = new float [qtd];

for (int i=0; i< qtd;++i) {
	System.out.println(" insira o"+ (i+1)+"� do vetor A");
	vetorA[i]= sc.nextFloat();
	
	somaA=somaA+ vetorA[i];
	mediaA= somaA/qtd;
	
	sc.reset();
}
System.out.printf("\nA m�dia de A � % .0f\nA soma �%.00f" , mediaA,somaA);
 for (int j=0; j<qtd;++j) {
	 System.out.println("\nInsira o"+(j+1)+"� do vetor B");
	 vetorB[j]= sc.nextFloat();
	 
	 somaB=somaB+vetorB[j];
	 mediaB=somaB/qtd;
	 sc.reset();
 }
 System.out.printf("\nA m�dia de B � %.0f\nA soma 	� %.00f", mediaB,somaB);
 if (somaA>somaB) {
	 System.out.printf("A soma � de A%.0f\n",somaA);
	 
 }else if (somaA==somaB) {
	 System.out.printf("A soma dos dois vetores � igual .\nValor:%.0f",somaA);
	 
 }else { 
	 System.out.printf(" A maior soma � de B%.0f\n",somaB);
	
 }
 if(mediaA<mediaB) {
	 System.out.printf("A maior m�dia � de A%.0f",mediaA);
	 
 }else if(mediaA == mediaB) {
	 System.out.printf(" A m�dia dos dois valores vetores � igual .\nvalor:0f",mediaA);
	 
 }

	}

}
