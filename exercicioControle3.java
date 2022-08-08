package Controle;

import java.util.Scanner;

public class exercicioControle3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma nota: ");
		double nota1 = entrada.nextInt();
		
		System.out.println("Informe uma nota: ");
		double nota2 = entrada.nextInt();
		
		double media =(nota1+nota2)/2;
		
		if(media >= 7.0) {
			System.out.println("Aprovado!");
		} else if (media<7.0 && media>=4.0) {
			System.out.println("Recuperação");
		}else(nota>4.0){
			System.out.println("Reprovado");
		}

		entrada.close();

	}

}
