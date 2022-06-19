package menu;

import java.util.Scanner;

public class menu_de_umjogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		int opcao=0;
				Scanner scan=new Scanner(System.in);
				do {
				
				System.out.println(" 1 - Instruções ");
				System.out.println(" 2 - Jogar ");
				System.out.println(" 3 - Créditos ");
				System.out.println(" 4 - Sair ");
				System.out.println(" Escolha uma das opções ");
				 opcao=scan.nextInt();

			
				switch (opcao){
				
				case 1:
					System.out.println(" instruções ");
					break;
				
				case 2:
					System.out.println(" Jogar ");
					break;
				
				case 3: 
					System.out.println(" Créditos ");
					break;
				
				case 4: 
					System.out.println(" Sair ");
					break;
				
				default:
			        System.out.println(" Não esta no menu ");
			        break;
				}
					
				} while (opcao <4);
	}
}




