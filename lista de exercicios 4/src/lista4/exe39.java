package lista4;

import java.util.Scanner;

public class exe39 {

	public static void main(String[] args) {
	int n=0,m=0,p=0;
	int produto=0,produto2=0,produtototal=0;
Scanner sc = new Scanner (System.in);

System.out.println(" Insira a quantidade de linhas ");
n=sc.nextInt();
System.out.println(" Insira o numero de colunas da primeira matriz e o numero de linhas da segunda matriz ");
m=sc.nextInt();
System.out.println("insira o numero de colunas ");
p=sc.nextInt();

int matriz[][]=new int[n][m];
int matriz2[][]=new int [m][p];

System.out.println("\n-------MATRIZ------");
for(int l=0;l<matriz.length;l++) {
	for(int c=0; c<matriz[l].length;c++) {
		System.out.println(" informe o "+(c+1)+"°numero da "+(l+l)+"°linha");
		matriz[l][c]=sc.nextInt();
		produto+=matriz[l][c];
	}
}
System.out.println("\n-----matriz2-------");
for(int l=0;l<matriz2.length;l++) {
	for(int c=0;c<matriz2[l].length;c++) {
		System.out.println(" informe o"+(c+l)+"°linha");
		matriz2[l][c]=sc.nextInt();
		produto2+=matriz[l][c];
}
	}
produtototal=produto*produto2;
System.out.println(produtototal);

}
}
