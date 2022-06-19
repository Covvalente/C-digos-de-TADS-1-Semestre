import java.util.Scanner;

public class Ex_1 {
    static int num (int a, int b, int c){

        if(a<b & a<c){
            return(a);
        }
        if(b<a & b<c){
            return(b);
        }
        if(c<b & c<a){
            return(c);
        }
        return(0);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor ");
        int N1 = sc.nextInt();
        System.out.println("Digite o segundo valor ");
        int N2 = sc.nextInt();
        System.out.println("Digite o terceiro valor ");
        int N3 = sc.nextInt();
        System.out.print("O menor número é " + num(N1, N2, N3));
    }
}
