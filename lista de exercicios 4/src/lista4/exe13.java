package lista4;

import java.util.Scanner;

public class exe13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);

int qtd=0;
System.out.println(" insira o tamanho dos vetores de A e B");
qtd=sc.nextInt();

float []vetorA=new float [qtd];
float [] vetorB= new float[qtd];
float [] vetorC= new float [qtd];

for (int i=0; i< vetorA.length;++i) {
	System.out.println(" Insira o "+(i+1)+"° valor do vetor A");
	vetorA[i]=sc.nextInt();
	vetorC[i]=vetorA[i];
	sc.reset();
	}
for (int j =0; j< vetorB.length;++j) {
	System.out.println("insira o"+(j+1)+"° valor do vetor B");
	vetorB[j]=sc.nextInt();
	vetorC[j+qtd]=vetorB[j];
	sc.reset();
	
}
for ( int m =0; m < vetorC.length;++m) {
	System.out.println(vetorC[m]);
	sc.reset();
}
}
	
}
