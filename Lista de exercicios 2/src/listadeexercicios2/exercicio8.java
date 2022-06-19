package listadeexercicios2;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i;
	       int n = 0;
	       float media = (float) 0.0; 
	       
	       for (i = 14; i < 73; i++) {
	        if (i % 2 == 0) {
	           media = media + i;
	           n++;
	        }   
	       }
	       media = media / n;
	       System.out.println("A Média Aritmética é: " +media);
	}

}
