package listadeexercicios2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		 String name;
	        String sexo;
	        String nameM = ""; 
	        String sexoM = "";
	        int idade = 0;
	        int i = 0;
	        int idadem = 0;
	        
	        Scanner sc = new Scanner (System.in);
	        
	        do {
	           System.out.println("Digite o seu Nome");
	           name = sc.next();
	           
	           System.out.println("Digite a sua Idade");
	           idade = sc.nextInt();
	           
	           System.out.println("Digite o seu Sexo (M ou F)");
	           sexo = sc.next();
	           
	            i= i + 1;
	           
	           if (idade > idadem){
	           idadem = idade;
	           nameM = name;
	           sexoM = sexo;
	    } 
	    } while (i < 5);
	       
	    System.out.println("Nome: " +nameM+ " \nIdade: " +idadem+ " \nSexo: " +sexoM);
		
	}

}
