import java.util.Scanner;

public class Ex_7 {

    static double raio (double r){

        double V = (4 * Math.PI * Math.pow(r, 3)/3);

        return V;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio da esfera ");
        double n = sc.nextDouble();
        System.out.println("O volume da esfera é: " + raio(n));
    }
}
