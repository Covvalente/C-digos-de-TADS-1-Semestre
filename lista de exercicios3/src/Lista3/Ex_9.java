import java.util.Scanner;

public class Ex_9 {

    static double idade (int a, int m, int d) {

        int anobi = a/4;
        double iddias = (a * 365) + (m * 30.41666) + d + anobi;

        return iddias;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade exata em: ");
        System.out.println("Anos: ");
        int a = sc.nextInt();
        System.out.println("Meses: ");
        int m = sc.nextInt();
        System.out.println("Dias: ");
        int d = sc.nextInt();
        System.out.println("Essa é sua idade em dias: " + idade ( a, m, d));

    }
}



