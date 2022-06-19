package lista4;

import java.util.Scanner;

public class exe30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);

int linha=0; 
int coluna=0;
System.out.println(" Digite a quantidade de linhas desejadas");
linha=sc.nextInt();
System.out.println(" Digite a quantidade de colunas desejadas ");
coluna=sc.nextInt();

int matriz[][]= new int[linha][coluna];
int M[]= new int [linha];

System.out.println("\n------VETOR------");
for(int i=0;i<matriz.length;i++) {
	System.out.println("informe o"+(i+1)+"°numero:");
	M[i]=sc.nextInt();
}
System.out.println("\n------MATRIZ-------");
for(int l=0;l<matriz.length;l++) {
	for(int c=0;c<matriz[l].length;c++) {
		matriz[l][c]=M[l];
	}
}
for(int l=0;l<matriz.length;l++) {
	for(int c=0;c<matriz[l].length;c++) {
		System.out.print(matriz[l][c]+"\t");
	}
	System.out.println();
}
	}

}
