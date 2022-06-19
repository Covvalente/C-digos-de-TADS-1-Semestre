package ado3;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float desconto;
		float valor= Integer.parseInt(
				JOptionPane.showInputDialog("Qual o valor da sua compra ?"));
		if (valor >= 300 ) {
			desconto =(float) ( valor * 0.20);
			System.out.println("O valor da sua compram deu R$" +(valor -desconto)+ "e o valor do seu descontofoi de R$" + desconto);
		}
		else {
			desconto=(float) (valor*0.15);
			System.out.println("O valor da sua compram deu R$" +(valor -desconto)+ "e o valor do seu descontofoi de R$" + desconto);
		
		}
	}

}
