package exercicios;


	import java.util.Scanner;
	public class exercicio1 {
	
	    public static void main(String[] args) {
	        
	      Scanner numero = new Scanner (System.in);       
	        System.out.println("Digite um numero");
	        int N1 = numero.nextInt();
	        if(N1 >100){
	            System.out.println(N1+150);}
	        else {
	            System.out.println(N1);
	     }
	    }
	}
	    