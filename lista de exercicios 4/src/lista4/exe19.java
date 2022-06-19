package lista4;

import java.util.Scanner;

public class exe19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

int qtd=0;

System.out.println(" insira o tamanho que deseja para o vetor");
qtd=sc.nextInt();

int[]vetor=new int[qtd];
for(int i =0; i < vetor.length;++i) {
	
	System.out.println(" Digite o "+ (i+1)+"º valor do vetor");
	
}
for (int j=0;j<vetor.length;++j) {
	if ( vetor[j]%2==1) {
		System.out.println(vetor[j]);
	}
}
}

}
