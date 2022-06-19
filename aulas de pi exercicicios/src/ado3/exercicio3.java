package ado3;

import javax.swing.JOptionPane;

public class exercicio3 {
	public static void main(String[] args) {
		float ano= Integer.parseInt(
		JOptionPane.showInputDialog("Digite um ano com quatro digitos"));
		if(ano % 4== 0 && ano % 100 !=0 || ano% 400==0) {
			System.out.println("Esse ano é bissexto!!");
		}else
		
		{
		System.out.println("esse ano não é bissexto!!");
	}
}
}
