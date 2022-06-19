package exe7;

import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

	        String aux;
	        int cont = 0;
	        int random;

	        String vetor1[] = {"0", "0", "0", "0", "0"};
	        String vetor[] = {"[A] Algoritmos ", "[B] Fundamentos Adm ", "[C] Conceitos de computação ", "[D] Pts ", "[E] Matematica "};

	        while (cont != 2) {
	            System.out.println("Qual a disciplina de segunda ?");
	                for (int j = 0; j < vetor.length; ++j) {
	                    random = (int) (Math.random() * 5);

	                    if (vetor[random] != vetor1[j]) {
	                        aux = vetor[random];
	                        vetor[random] = vetor1[j];
	                        vetor1[j] = aux;

	                    } else {
	                        vetor1[j] = vetor[random];

	                    }
	                }
	            for (int m = 0; m < vetor.length; ++m) {
	                System.out.println(vetor1[m]);

	            }
	            String N = sc.next();

	            switch (N) {

	                case "A":
	                case "a":
	                    cont = 2;
	                    System.out.println("Resposta correta ");
	                    break;


	                case "B":
	                case "b":

	                    System.out.println("Resposta errada ");
	                    break;

	                case "C":
	                case "c":

	                    System.out.println("Resposta errada ");
	                    break;

	                case "D":
	                case "d":

	                    System.out.println("Resposta errada ");
	                    break;

	                case "E":
	                case "e":

	                    System.out.println("Resposta errada ");

	            }
	        }
	    }
	

	}


