package lista4;

import java.util.Scanner;

public class exe34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int soma=0;
System.out.println(" Digite a quantidade de linha que deseja para matriz");
int qtdL=sc.nextInt();
System.out.println(" Digite a quantidade de colunas que deseja para matriz ");
int qtdC=sc.nextInt();

int matriz [][]=new int [qtdL][qtdC];

for(int l=0;l<matriz.length;++l) {
	for(int c =0;c<matriz[l].length;++c) {
		System.out.println("\nDigite o"+(c+1)+"°elemento da "+(l+l)+"°linha");
		matriz[l][c]=sc.nextInt();
		soma+= matriz[l][c];		
	}
}
for (int l=0;l<matriz.length;++l) {
	for(int c =0;c<matriz[l].length;++c) {
		System.out.print(matriz[l][c]+"\t");
	}
	System.out.println();
	System.out.println(" A soma dos elementos da "+(l+l)+"°linha é"+soma);
}
	}

}
