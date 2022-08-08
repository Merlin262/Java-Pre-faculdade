package Controle;

import java.util.Scanner;

public class ExerciciosControle1 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O numero eh par.");
			} else {
				System.out.println("O numero não eh par.");
			}
		}
		scanner.close();
	}
}
