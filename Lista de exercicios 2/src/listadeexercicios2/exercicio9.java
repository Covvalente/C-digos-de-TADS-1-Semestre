package listadeexercicios2;

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		int i, nalunos = 0;
        float nota, acumnotas, media;
        
        Scanner sc = new Scanner (System.in);
        
        acumnotas = 0;
        
        System.out.println("Informe o Número de Alunos da Turma: ");
        nalunos = sc.nextInt();
        
        for (i = 0; i < nalunos; i++) {
            System.out.println("\nInforme a Nota do " +(nalunos - i)+ " aluno(s)");
            nota = sc.nextFloat();
            
            acumnotas = acumnotas + nota;
        }
        
        media = acumnotas / nalunos;
        System.out.println("\n A Média da Turma é: " +media);
        
    }
	}

