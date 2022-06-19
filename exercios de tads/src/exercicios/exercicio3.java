package exercicios;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
	     double peso;
	    double altura;
	       
	    Scanner leia  = new Scanner (System.in);  
	       System.out.println("Informe seu peso ");
	       peso =leia.nextDouble();
	       System.out.println("Informe sua Altura");
	      altura =leia.nextDouble();
	      
	      double imc;
	      imc = peso / (altura*altura );
	      
	      if (imc < 26){
	      System.out.println("normal ");
	    }else if (imc >= 26 && imc <= 30){
	    System.out.println("obeso");
	     }else if (imc >30){
	   System.out.println("obeso mórbido");
	   
	    }
	    }
	}
	    

