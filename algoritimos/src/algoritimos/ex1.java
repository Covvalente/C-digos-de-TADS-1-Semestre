package algoritimos;

public class ex1 {
	
	static void imprimirNota (double nota){
		String status;
		if (nota >= 6){
			
		status = “Aprovado”;
		}
		else {
		status = “Reprovado”;
		}
		System.out.println(status);
		}
		public static void main (String [] args){
		imprimirNota(6.7);
}
}

