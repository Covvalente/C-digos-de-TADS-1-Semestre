package lista4;

import java.util.Scanner;

public class exe42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println(" Digite o numero de linhas que deseja para a matriz");
int qtdL=sc.nextInt();
System.out.println("Digite o numero de colunas que deseja para matriz");
int qtdC=sc.nextInt();

int maior1=0,maior2=0;
int matriz1[][]= new int[qtdL][qtdC];
int matriz2[][]=new int [qtdL][qtdC];

System.err.println("-------1°MATRIZ--------");
for(int l=0;l<matriz1.length;++l) {
	for(int c=0;c<matriz1[1].length;++c) {
		System.out.println(" Insira o elemento da "+(c+1)+"°coluna e da "+(l+l)+"°linha da primeira matriz");
	matriz1 [l][c]=sc.nextInt();
	
	if(matriz1[l][c]>maior1){
		maior1=matriz1[l][c];
		
	}
	}
}
System.err.println("--------2°MATRIZ--------");
for(int l=0;l<matriz2.length;++l) {
	for(int c=0;c<matriz2[1].length;++c) {
		System.out.println(" Insira o elemento da "+(c+1)+"°coluna e da "+(l+l)+"°linha da segunda matriz");
	matriz2[l][c]=sc.nextInt();
	
	if(matriz2[l][c]>maior2) {
		maior2=matriz2[l][c];
	}
	}

}
System.out.println(" o maior numero da primeira matriz é:"+maior1);
System.out.println("o maior numero da segunda matriz é:"+maior2);
System.out.println("o produto deses numeros é;"+(maior1*maior2));
	}
}
