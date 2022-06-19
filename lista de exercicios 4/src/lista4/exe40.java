package lista4;

import java.util.Scanner;

public class exe40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Insira o numero que quer identificar na matriz ");
int N=sc.nextInt();

int matriz[][]=new int[2][4];
matriz[0][0]=4;
matriz[0][1]=3;
matriz[0][2]=1;
matriz[0][3]=21;
matriz[1][0]=3;
matriz[1][1]=40;
matriz[1][2]=38;
matriz[1][3]=57;

for(int l=0;l<matriz.length;++l){
	for(int c=0;c<matriz[l].length;++c){
		
		if(N==matriz[l][c]) {
			System.out.println("Numero"+N+"encontrado na"+(c+1)+"°coluna da "+(l+l)+"°linha");
			
		}
	}
}
for(int l =0;l<matriz.length;++l) {
	for(int c=0;c<matriz[l].length;++c) {
		System.out.print(matriz[l][c]+"\t");
	}
	System.out.println();
}
	}

}
