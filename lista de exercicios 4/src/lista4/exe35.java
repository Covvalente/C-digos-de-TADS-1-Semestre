package lista4;

import java.util.Scanner;

public class exe35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner (System.in);
 float soma=0, media =0,cont=0;
 System.out.println(" Digite a quantidade de linha que deseja para matriz");
 int qtdL=sc.nextInt();
 System.out.println(" Digite a quantidade de colunas que deseja para matriz");
 int qtdC=sc.nextInt();
 
 int matriz[][]=new int [qtdL][qtdC];
 for(int l=0;l<matriz.length;++l) {
	 for(int c=0;c<matriz[l].length;++c) {
		 System.out.println("\n Digite o "+(c+1)+"°elemento da "+(l+l)+"°linha");
		 matriz[l][c]=sc.nextInt();
		 
		 if(matriz[l][c]>0) {
			 cont ++;
			 soma+=matriz[l][c];
		 }
	 }
 }
	 media=soma/cont;
	 for(int l=0;l<matriz.length;++l) {
		 for(int c=0;c<matriz[l].length;++c) {	 
			 System.out.print(matriz[l][c]+"\t");
		 }
		 System.out.println();
	}
System.out.println("A soma dos elementos positivos da matriz é:"+soma);
System.out.println("A média dos elementos positvos da matriz é:"+ media);
}
}
