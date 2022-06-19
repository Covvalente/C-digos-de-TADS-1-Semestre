package piexercicios;


import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valor1= Integer.parseInt(
				JOptionPane.showInputDialog("Digite o valor 1 º"));
		float valor2 =Integer.parseInt(
				JOptionPane.showInputDialog("Digite o valor 2º "));
		float valor3 =Integer.parseInt(
				JOptionPane.showInputDialog("Digite o valor 3º "));
		System.out.println(" O valor deo produto desses valores é de :"+ (valor1 +valor2+valor3));
	}

}
