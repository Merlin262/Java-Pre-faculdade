package Controle;

import java.util.Scanner;

public class Dowhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voce precisa falar as palavras magicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine(); 
		}while(!texto.equalsIgnoreCase("por favor"));
			
			System.out.println("obrigado");
		

		entrada.close();

	}

}
