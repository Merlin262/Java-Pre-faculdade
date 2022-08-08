package Controle;

import java.util.Scanner;

public class exercicioControle7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um valor:");
		double valor1 = entrada.nextInt();
		
		System.out.println("Informe um valor:");
		double valor2 = entrada.nextInt();
		
		double valor3 = valor1+valor2;
		
		if(valor1>0 || valor2>2) {
			System.out.println("A soma dos valores eh igual a:" + valor3);
		} else if(valor1<0 || valor2<0) {
			System.out.println("Valor Incorreto!!!");
		}
		System.out.println("Fim!!!");
			
		entrada.close();

	}

}
