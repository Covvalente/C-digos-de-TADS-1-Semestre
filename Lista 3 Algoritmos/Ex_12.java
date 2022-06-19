import java.util.Scanner;

public class Ex_12 {
    static double Pdeal(double a, String s) {

        double p = 0;
        String m = null;
        String f = null;

        if ("m".equalsIgnoreCase(s)) {
            p = (72.7 * a - 58);

        } else if ("f".equalsIgnoreCase(s) ) {
            p = (62.1 * a - 44.7);

        }
    return (p);
}

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua altura ");
    double a = sc.nextDouble();
    System.out.println("Digite seu sexo: \n[F] ou [M] ");
    String s = sc.next();
    System.out.println("Seu peso ideal é: " + Pdeal(a ,s));

    }
}
