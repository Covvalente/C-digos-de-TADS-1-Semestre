package lista4;

import java.util.Scanner;

public class exe38 {

	public static void main(String[] args) {
	
		int quant=0;
Scanner sc= new Scanner (System.in);

System.out.println(" insira a quantidade da matriz ");
quant=sc.nextInt();

int mat[][]=new int[quant][quant];
System.out.println("\n-----MATRIZ------");

for(int l=0;l<mat.length;l++) {
	for(int c=0;c<mat[l].length;c++) {
		System.out.println(" informe o "+(c+1)+"°numero da "+(l+l)+"°linha");
		mat[l][c]=sc.nextInt();
		
	}
}
System.out.println();
System.out.println("MATRIZ");
for(int l=0;l<mat.length;l++) {
	for(int c=0;c<mat[l].length;c++) {
		System.out.print(mat[l][c]+"\t");
	}
	System.out.println();
}
System.out.println();
System.out.println("Diagonal principal");
if (quant%2==0) {
	for(int i=0;i<mat.length/2;i++){
		System.out.print(mat[i][i]+"\t");
	}
}
if (quant%2==1) {
	for(int i=0;i<(mat.length-1)/2;i++) {
		System.out.println(mat[i][i]+"\t");
	}
}
System.out.println();
	}

}
