package lista4;

import java.util.Scanner;

public class exe33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);

System.out.println(" Digite quantas linhas deseja para matriz");
int qtdL=sc.nextInt();
System.out.println(" Digite quantas colunas deseja para matriz");
int qtdC=sc.nextInt();

int matriz[][]=new int[qtdL][qtdC];
System.out.println("\n------MATRIZ-----");

for (int l=0;l<matriz.length;l++) {
	for(int c=0;c<matriz[l].length;c++) {
		System.out.println(" informe o "+(c+1)+"°numero da "+(l+l)+"°linha");
		matriz[l][c]=sc.nextInt();
	}
}
for(int l=0;l<matriz.length;l++) {
	for(int c=0;c<matriz[l].length;c++) {
		
		if(matriz[l][c]<0) {
			System.out.print(matriz[l][c]+"\t");
		}
	}
	System.out.println();
}
	}

}
