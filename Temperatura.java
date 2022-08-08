package fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite seu nome: ");
	String nome = entrada.nextLine(); 
	
	System.out.println("Digite seu sobrenome: ");
	String sobrenome = entrada.nextLine();
	
	System.out.println("Digite sua idade: ");
	int idade = entrada.nextInt();
	
	System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
	
	entrada.close();
	
	}
}
