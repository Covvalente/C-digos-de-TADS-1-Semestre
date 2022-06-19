package piexercicios;

import javax.swing.JOptionPane;

public class exercicio3 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite Um número"));
		
		for (int i=1 ; i<11 ; i++)				
		{
	System.out.println(numero +"x" + i + "=" +(numero*i));
}
}
}