import java.util.Scanner;
/**
 *
 * @author mateu
 */
public class exercicio2 {
    public static void main(String[] args) {
       Scanner Leitor = new 
       Scanner(System.in);
        System.out.println("Digite o primeiro número");
        float N1 =Leitor.nextFloat();
        System.out.println("Digite o segundo número");
        float N2 =Leitor.nextFloat();
        if (N1%N2 ==0){
            System.out.println("A divisão do número"+N2+"por"+N2+"é exata");
        }else{
            System.out.println("A divisão do número"+N2+"por"+N2+"não é exata ");
        }
    }
}