package ado2;

import javax.swing.JOptionPane;

public class exe3 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite Um numero"));
		
		for (int i=1 ; i<11 ; i++)				
		{
	System.out.println(numero +"x" + i + "=" +(numero*i));
}
}
}
