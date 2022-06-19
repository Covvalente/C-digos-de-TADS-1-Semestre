package lista4;

import java.util.Scanner;

public class exe31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int linha=0;
		int coluna=0;
Scanner sc= new Scanner (System.in) ;
 System.out.println(" insira a quantidade de linhas ");
 linha=sc.nextInt();
 
 System.out.println(" insira a quantidade de colunas");
 coluna=sc.nextInt();
 int matriz[][]=new int [linha][coluna];
 int soma []=new int [linha];
 
 System.out.println("\n-----MATRIZ-----");
 
 for(int l=0;l<matriz.length;l++) {
	 for(int c=0;c<matriz[l].length;c++) {
		 System.out.println(" informe o"+(c+l)+"°numero da "+(l+l)+"°linha");
		 matriz[l][c]=sc.nextInt();
		 soma[c]+=matriz[l][c];
	 }
 }
 
 System.out.println();
 System.out.println(" Números inseridos na amtriz");
 
 for(int l=0;l<matriz.length;l++) {
	 for(int c=0;c<matriz[l].length;c++) {
		 System.out.print(matriz[l][c]+"\t");
		 		 
	 }
	 System.out.println();
 }
 System.out.println();
 
 for(int i=0;i<soma.length;i++) {
	 
         System.out.println("A soma da " +(i+1)+ "º coluna é: " +soma[i]);
 }
	}

}

