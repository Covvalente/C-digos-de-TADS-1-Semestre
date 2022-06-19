package pi;
// codigo que adivinha um valor de 1 a 100
import java.util.Scanner;
import java.util.Random;
 
public class exe10 {
 public static void main(String[] args){
 
 Scanner input = new Scanner(System.in);
 Random random = new Random();
 
 boolean acertou = false;
 boolean errou= true;
 int escolha=0;
 int tentativas = 5;
 int numeroSecreto = random.nextInt(100+1);
 long numero = 0;
 
 
 System.out.println(numeroSecreto);
 
 while(tentativas > 0 && acertou == false){
 System.out.println("Qual seu numero?");
 numero = input.nextLong();
 

 if(numeroSecreto == numero){
 System.out.println("Parabéns, você ganhou o jogo!!");
 acertou = true;

 
 } else if(numero < numeroSecreto){
 --tentativas;
 System.out.println("Numero Menor que o desejado ! " + tentativas + " tentativas restantes.");

 
 } else if (numero > numeroSecreto) {
	 --tentativas;
	 System.out.println("Numero Maior que o desejado !" + tentativas + " tentativas restantes.");	
 }
 
 if (numero==numeroSecreto -1|numero==numeroSecreto+1) {
	 System.out.println(" Tá Quente" );
	break;
 }
 }
 
	 System.out.println( " game over " );
	 errou= true;
	
	 
 
	 
	 
 }
 }
 



	

 


