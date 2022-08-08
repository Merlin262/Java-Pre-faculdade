package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o numero de notas: ");
		int QuantidadeDeNotas = entrada.nextInt();

		double[] notas = new double [QuantidadeDeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i+1) + ": " + "\n");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.println("A media eh " + (total/notas.length));

		entrada.close();

	}

}
