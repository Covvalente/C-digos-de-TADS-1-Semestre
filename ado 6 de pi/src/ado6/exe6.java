package ado6;

import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner (System.in);
int tentativas=0;
int contador=0;
int opcao=0;
do {
System.out.println(" Qual é a disciplina de terça feira ? ");
System.out.println(" (A) algoritimos ");
System.out.println(" (B) Fundamentos_Adm ");
System.out.println(" (C) Conceitos de computação ");
System.out.println(" (D) Pts ");
System.out.println(" (E) Matematica ");
System.out.println(" (F) lógica ");
String N=sc.next();


switch (N){

case "A":
case "a":
	contador ++;
    tentativas ++;
    opcao = 2;
	System.out.println(" Resposta errada ");
	break;

case "B":
case "b":
	  contador ++;
      tentativas ++;
      opcao = 2;
	System.out.println(" Resposta errada ");
	break;

case "C":
case "c":
	  contador ++;
      tentativas ++;
      opcao = 2;
	System.out.println(" Resposta errada ");
break;
case "D":
case "d":
	
	  contador ++;
      tentativas ++;
      opcao = 2;
	System.out.println(" Resposta errada ");
	
break;
case "E":
case "e":
	  contador ++;
      tentativas ++;
      contador = 2;
	System.out.println(" Resposta errada ");
break;
case "F":
case "f":
	 contador = 3;
     tentativas ++;
     opcao = 1;
	System.out.println(" Resposta correta ");
break;

}
	
} while (contador<3);

if (tentativas <= 3 & opcao == 1 ) {
    System.out.println("Resposta correta na " + tentativas + "° tentativa");

} else if (tentativas <= 3 && opcao == 2) {
    System.out.println("Resposta incorreta nas 3 tentativas ");
}
}
}





	


