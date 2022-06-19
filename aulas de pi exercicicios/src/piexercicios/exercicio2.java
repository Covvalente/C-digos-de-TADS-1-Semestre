package piexercicios;

import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor = Integer.parseInt(
				JOptionPane.showInputDialog("Digite um valor "));
		for (int i=1 ; i <4 ; i++)
		{
			System.out.println(valor +" x " + i + "=" +(valor*i));	
	}
	}
}
