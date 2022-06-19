package lista4;

import java.util.Scanner;

public class exe23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Digite quantas linhas deseja para matriz");
		int qtdL=sc.nextInt();
		System.out.println(" Digite quantas colunas deseja para a matriz");
		int qtdC=sc.nextInt();
		sc.close();
		
		int matriz [][]= new int [qtdL][qtdC];
		for (int l =0;l<matriz.length;++l) {
			for(int c=0; c<matriz.length;++c) {
				
				if((l+1)%2==1) {
					matriz[l][c]=21;
					
				}else if ((l+1)%2==0) {
					matriz[l][c]=10;
				}
			}
		}
for(int l=0;l<matriz.length;++l) {
	for(int c =0;c<matriz.length;++c) {
		System.out.print(matriz[l][c]+"\t");
	}
	System.out.println();
}
	}

}
