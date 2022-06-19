package lista4;

import java.util.Scanner;

public class exe37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int contL=0,contC=0,somaL=0,somaC=0;

System.out.println(" Digite a quantidade de linha que deseja para matriz ");
int qtdL=sc.nextInt();
System.out.println(" Digite a quantidade de colunas que deseja para matriz ");
int qtdC=sc.nextInt();

int matriz[][]=new int[qtdL][qtdC];

for(int l=0;l<matriz.length;++l) {
	for(int c=0;c<matriz[l].length;++c) {
		System.out.println("\nDigite o"+(c+l)+"°elementoda"+(l+l)+"°linha");
		matriz[l][c]=sc.nextInt();
		
		 somaL += matriz[l][c];
		 
		if(somaL==0&&(c+1)==matriz[c].length) {
			contL++;
			
		}

		if(somaL==0&&(l+1)==matriz[l].length) {
			contC++;
	}
	}
	somaL=0;
}
	for(int l =0;l<matriz.length;++l)
		for(int c=0;c<matriz[l].length;++c){
			System.out.print(matriz[l][c]+"\t");
		
   System.out.println();

		}

System.out.println("linhas nulas:"+contL);
System.out.println(" Colunas nulas"+contC);
		}
	}



