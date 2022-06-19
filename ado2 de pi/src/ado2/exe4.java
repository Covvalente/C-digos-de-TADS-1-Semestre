package ado2;

import java.util.ArrayList;

public class exe4 {

	
		// TODO Auto-generated method stub
private ArrayList <Character> caracteres;
private ArrayList <Integer>	quantidades;

public static void main(String[]args) {
	new exercicio4();
}
    void exercicio4(){
	contar("Mateus");
	printResult();
    }
private void printResult() {
	System.out.println("--------------");

for(Character i: caracteres) {
	System.out.println(i+"-" +quantidades.get(caracteres.indexOf(i)));
}
	
}
private void contar(String texto) {
	caracteres = new ArrayList();
	quantidades = new ArrayList();
	
	for(Character i: texto.toCharArray()) {		
		i = Character.toUpperCase(i);
		
		if(!caracteres.contains(i)) {
			caracteres.add(i);
			quantidades.add(1);
		}else {
			int indice = caracteres.indexOf(i);
			quantidades.set(indice, quantidades.get(indice)+1);
			 
			
		}

	}
}
}
