package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota>=7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabens!");
		}
			
		if(nota<7.0 && nota >=4.5) {
			System.out.println("Recuperação");
		}	
		
		if(nota<4.5 && nota >=0) {
			System.out.println("Reprovado");
		}
		
		
		
		
		entrada.close();
	}

}
