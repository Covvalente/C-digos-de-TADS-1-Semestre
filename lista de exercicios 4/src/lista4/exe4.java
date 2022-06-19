package lista4;

public class exe4 {
	
	

	    public static void main(String[] args) {

	        int vetor[] = {20, 3, 1, 5, 9, 7};
	        int menor = 0;

	        for (int i = 0; i < vetor.length; i++) {
	            if(menor == 0){
	                menor = vetor[i];

	            }
	                if ( menor > vetor[i]) {
	                menor = vetor[i];

	            }
	        }
	        System.out.println("Maior elemento do vetor: " + menor);
	    }
	}



