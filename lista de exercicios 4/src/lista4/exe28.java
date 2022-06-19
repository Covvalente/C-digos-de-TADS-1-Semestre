package lista4;

import java.util.Scanner;

public class exe28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System .in);
int soma=0,soma1=0;

System.out.println(" Digite a quantidade de linhas que deseja para matriz");
int qtdL=sc.nextInt();
System.out.println(" Digite a quantidade de colunas que deseja para matriz");
int qtdC=sc.nextInt();

int matriz[][]=new int[qtdL][qtdC];

for(int l=0;l<matriz.length;++l) {
	for (int c =0;c<matriz[l].length;++c) {
		if(l==0) {
			System.out.println("\n Digite o"+(c+1)+" ° elemento da "+(l+1)+"°linha");
			matriz[l][c]=sc.nextInt();
			
			soma += matriz [l][c];
			System.out.println(" a soma dos elementos da"+(l+l)+"°inha é :"+soma);
		}
		if(l>0) {
				System.out.println("\n Digite o"+(c+l)+"°elemento da "+(l+l)+"°linha");
		matriz[l][c]=sc.nextInt();
		soma1+=matriz[l][c];
		System.out.println("A soma dos elementos da "+(l+l)+"°linha é:"+soma1);
		
	}
}
	soma1=0;
	
}
for(int l=0;l<matriz.length;++l) {
	for(int c=0;c<matriz[l].length;++c) {
		System.out.print(matriz[l][c]+"\t");
	}
	System.out.println();
}
	}
}


