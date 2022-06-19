package lista4;

import java.util.Scanner;
public class exe18 {
public static void main (String [] args ) {
	
	
Scanner sc= new Scanner (System.in);
float vetor[]= {50,65,120,250,6,9};
System.out.println(" Digite o numero que quer verificar ");
float N =sc.nextInt();

for (int i =0; i <vetor.length;++i){
	if (N== vetor[i]) {
		System.out.println(" Numero esta presente no vetor\nNa"+(i+1)+"ºposição");
		break;
	}else if ( N!=vetor[i]&&i==5) {
		System.out.println(" Esse numero não se encontra no vetor ");
	}
}

}
}