import java.util.Scanner;

public class Ex_13 {
    public static int funcao(int N) {

        int cont = 0;

        for (int i = 1; i <= N; i++) {

            if (N % i == 0) {
                cont ++;

            }
        }
        return cont;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = sc.nextInt();
        System.out.println("O número de divisores desse número é: " + funcao(N));

    }
}

