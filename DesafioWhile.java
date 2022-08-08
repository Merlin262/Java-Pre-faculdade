package Controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double quantidadenotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota>=0) {
			total +=nota;
			quantidadenotas++;
			}
		}   

		double media = total / quantidadenotas;
		System.out.println("Media =" + media);
		
		entrada.close();

	}

}
