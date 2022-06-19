package lista4;

import java.util.Scanner;

public class exe17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

int qtd =0;
float multi=0;
System.out.println(" insira o tamanho que deseja para o vetor ");
qtd=sc.nextInt();
System.out.println(" Digite o numero que ira multplicar os vetores ");
float N=sc.nextFloat();
float[]vetor = new float[qtd];

for(int i=0; i<vetor.length;++i) {
	System.out.println( " Digite o "+(i+1)+"o valor do vetor");
	vetor[i]=sc.nextFloat();
	multi=vetor[i]*N;
	System.out.println(vetor[i]+"X"+N+"="+multi);
}
	}

}
