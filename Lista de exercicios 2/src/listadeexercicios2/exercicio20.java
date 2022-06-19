package listadeexercicios2;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);

        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = Double.parseDouble(console.nextLine());

        int operacao = 0;
        double saldoAtual = saldoInicial;
        do {
            System.out.println("Digite uma operação. (1 = Deposito, 2 = Saque, 3 = Sair)");
            operacao = Integer.parseInt(console.nextLine());

            switch (operacao) {
                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    double deposito = Double.parseDouble(console.nextLine());

                    saldoAtual += deposito;
                    System.out.println("Saldo atual R$ " + saldoAtual);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    double saque = Double.parseDouble(console.nextLine());

                    saldoAtual -= saque;
                    System.out.println("Saldo atual R$ " + saldoAtual);
                    break;
                case 3:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Operação invalida!");
                    break;
            }
        } while (operacao != 3);

        if (saldoAtual > 0) {
            System.out.println("CONTA PREFERENCIAL.");
        } else if (saldoAtual < 0) {
            System.out.println("CONTA ESTOURADA.");
        } else {
            System.out.println("CONTA ZERADA");
        }

    }

	

}


