import java.util.Scanner;

public class Ex_2 {

    static int somatoria(int a) {

        int S = 0;

        if (a >= 0) {

            for (int i = 0; i <= a; i++) {

                S = S + i;
                System.out.println(S);

            }
        }
        return S;
    }
        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor ");
            int N = sc.nextInt();
            System.out.println("A soma dos número é: " + somatoria(N));
    }
}



