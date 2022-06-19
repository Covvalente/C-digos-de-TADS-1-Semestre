import java.util.Scanner;

public class Ex_8 {
    public static boolean funcao(int N) {

        int cont = 0;

        for(int i = 1; i <= N; i++){

            if (N % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int N = 0;
        boolean primo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para saber se ele é primo ");
        N = sc.nextInt();

        primo = funcao(N);

        System.out.println(primo);

    }
}





