package lista4;

public class exe5 {
	
	
	    public static void main(String[] args) {

	        float vetor[] = {20, 3, 10, 5, 9, 7};
	        float media = 0;
	        float S = 0;

	        for (int i = 0; i < vetor.length; i++) {
	            S = S + vetor[i];

	        }
	        media = S / vetor.length;
	        System.out.println("Média do vetor: " + media);
	    }
	}






