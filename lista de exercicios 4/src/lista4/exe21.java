package lista4;

import java.util.Scanner;

public class exe21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);

float qtd=0;
float  media=0,somas=0;

System.out.println(" Insira o numero de alunos");
qtd = sc.nextFloat();
sc.close();
	
String [] alunos =new String [(int)qtd];
float [] notas = new float [(int)qtd];

for (int i=0; i < alunos.length;++i) {
	System.out.println(" Digite o nome do "+(i+1)+"°aluno");
	alunos [i]=sc.next();
	
	 System.out.println("Digite as notas do " + (i + 1) + "° aluno");
     System.out.println((i + 1) + "° nota");
     notas[i] = sc.nextInt();
	
	somas = somas + notas[i];
	media=somas/qtd;
	
	sc.reset();
	
}
System.out.println(" A media da sala foi "+ media);
for (int m =0; m < notas.length;++m) {
	
	if ( notas [m]> media) {
		System.out.println(" Os alunos com a nota maior que a media foram:"+ alunos[m]);
		
	}
	sc.reset();
}
}
}
