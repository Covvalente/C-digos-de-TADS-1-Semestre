import java.util.Scanner;

public class Ex_11 {
    static double media(double a) {

        if (a > -1 && a < 5) {
            System.out.println("Conceito D");

        } else if (a > 4.9 && a < 7) {
            System.out.println("Conceito C");

        } else if (a > 6.9 && a < 9) {
            System.out.println("Conceito B");

        } else if (a > 8.9 && a < 10.1) {
            System.out.println("Conceito A");

        } else {
            System.err.println("Média imcompativel !! \nDigite uma média entre 1 e 10. ");

        }
        return a;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua média final ");
        double a = sc.nextDouble();
        System.out.println("Média final do aluno: " + media(a));

    }
}



