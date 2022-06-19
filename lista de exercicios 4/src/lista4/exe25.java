package lista4;

import java.util.Scanner;

public class exe25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);

System.out.println(" Digite a quantidade de linhas para a matriz");
int qtdL=sc.nextInt();
System.out.println(" Digite a quantidade de colunas para matriz");
int qtdC=sc.nextInt();
sc.close();

int matriz[][]=new int[qtdL][qtdC];

for (int l=0;l<matriz.length;++l) {
	for(int c=0;c<matriz[l].length;++c) {
		matriz[l][c]=l+1;
	}
	}
for(int l=0;l<matriz.length;++l) {
	for(int c=0;c<matriz[l].length;++c){
		System.out.print(matriz[l][c]+"\t");
		
	}
			System.out.println();
}
}
}