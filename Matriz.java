package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int qtDeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtDeNotas = entrada.nextInt();
		
		double [] [] notasDaturma = new double [qtDeAlunos][qtDeNotas];
		
		double total = 0;
		for (int i = 0; i < notasDaturma.length; i++) {
			for (int j = 0; j < notasDaturma[i].length; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", j+1,i+1);
				
				notasDaturma[i][j] = entrada.nextDouble();
				total += notasDaturma[i][j];
				
			}
		}
		
		
		double media = total / (qtDeAlunos * qtDeNotas);
		System.out.println("Media da turma eh: " + media);
		
		for(double [] notasDoAluno:notasDaturma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}

		entrada.close();

	}

}
