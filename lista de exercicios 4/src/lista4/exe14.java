package lista4;

import java.util.Scanner;

public class exe14 {
 public static void main (String[]args) {
	 
	Scanner sc = new Scanner (System.in);
	int qtd =0;
	System.out.println(" Insira o tamanho dos vetores de A e B");
qtd=sc.nextInt();

float []vetorA=new float[qtd];
float []vetorB=new float[qtd];
float []vetorC=new float[qtd];

for (int i=0; i< vetorA.length;++i) {
	System.out.println(" Insira o"+(i+1)+ "° valor do vetor A");
	vetorA[i]=sc.nextInt();
	
	if (i%2==0) {
		vetorC[i]=vetorA[i];
		sc.reset();
	}
}
for (int j=0;j<vetorB.length;++j) {
	System.out.println(" Insira o "+ (j+1)+"° valor do vetor B");
	vetorB[j]= sc.nextInt();
	
	if (j%2 ==1)
		vetorC[j]= vetorB[j];
	sc.reset();
	
 }
for (int m =0; m < vetorC.length;++m) {
	System.out.println(vetorC[m]);
	sc.reset();
}
}
}
