package lista4;

import java.util.Scanner;

public class exe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int qtd=0;
System.out.println(" Insira o tamanho do vetor que deseja ");
qtd=sc.nextInt();
int [] vetor = new int [qtd];
int[] vetor2 = new int [qtd];

for (int i=0;i<vetor.length;++i) {
	System.out.println("Digite o "+(i+1)+"º valor do vetor");
	vetor[i]=sc.nextInt();
	
	if(vetor[i]%3==0) {
		vetor2[i]=vetor[i];
		
	}
}
for(int j=0;j<vetor.length;++j) {
	if (vetor2[j]%2==1) {
		System.out.println(vetor2[j]);
	}
}

}

}
