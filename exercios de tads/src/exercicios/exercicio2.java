package exercicios;
import java.util.Scanner;
public class exercicio2 {
	public static void main(String[] args) {
	       Scanner Leitor = new 
	       Scanner(System.in);
	        System.out.println("Digite o primeiro n�mero");
	        float N1 =Leitor.nextFloat();
	        System.out.println("Digite o segundo n�mero");
	        float N2 =Leitor.nextFloat();
	        if (N1%N2 ==0){
	            System.out.println("A divis�o do n�mero"+N2+"por"+N2+"� exata");
	        }else{
	            System.out.println("A divis�o do n�mero"+N2+"por"+N2+"n�o � exata ");
	        }
	    }
	}


