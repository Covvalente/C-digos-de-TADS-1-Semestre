import java.util.Scanner;
/**
 *
 * @author mateus
 */
public class exercicio1 {
    public static void main(String[] args) {
        
      Scanner numero = new Scanner (System.in);  
      int n1= numero.nextInt();         
        System.out.println("Digite um numero");
        int n1 = numero.nextInt();
        if(n1 >100){
            System.out.println(n1+150);}
        else {
            System.out.println(n1);
        }
    }
}