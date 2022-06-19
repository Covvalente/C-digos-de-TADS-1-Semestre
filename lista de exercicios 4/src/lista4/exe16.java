package lista4;

import java.util.Scanner;

public class exe16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
int qtd=0	;
int aux;
boolean controle;

System.out.println(" insira o tamanho do vetor");
qtd=sc.nextInt();
int[]vetor=new int[qtd];

for (int i=0; i < vetor.length;++i) {
	System.out.println(" Digite o"+(i+1)+"o valor do vetor");
	vetor[i]=sc.nextInt();
	
}
for (int i=0;i <vetor.length;++i){
	controle = true;
	for(int j=0; j<(vetor.length-1);++j) {
		
		if (vetor[j]%2==1) {
			aux=vetor[j];
			vetor[j]=vetor[j+1];
			vetor[j+1]=aux;
			controle=false;
		}
		
	}if(controle) {
		break;
	}
}
for(int i=0; i < vetor.length;++i) {
	System.out.println(vetor[i]+"");
}
}
	
}