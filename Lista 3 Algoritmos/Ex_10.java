import java.util.Scanner;

public class Ex_10 {

    static int IdNad(int a) {

        if (a > 4 && a < 8) {
            System.out.println("Infantil A");

        } else if (a > 7 && a < 11) {
            System.out.println("Infantil B");

        } else if (a > 10 && a < 14) {
            System.out.println("Juvenil A");

        } else if (a > 13 && a < 18) {
            System.out.println("Juvenil B");

        } else if (a > 17) {
            System.out.println("Adulto ");

        } else {
            System.err.println("Idade imcompativel !! \nDigite uma idade maior. ");

        }
        return a;
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do nadador ");
        int a = sc.nextInt();
        System.out.println("Idade do nadador: " + IdNad(a) + " anos");

    }
}

