package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in );
		
		System.out.print("Digite o primeiro valor: ");
		double valor1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double valor2 = entrada.nextDouble();
		
		System.out.print("Escolha entre os operadores a seguir: +, -, *, /");
		String operador = entrada.next();
		
		double resultado = "+".equals(operador) ? valor1 + valor2 : 0;
		resultado = "-".equals(operador) ? valor1 - valor2 : resultado;
		resultado = "*".equals(operador) ? valor1 * valor2 : resultado;
		resultado = "/".equals(operador) ? valor1 / valor2 : resultado;
		
		System.out.printf("%f %s %f = %f", valor1, operador, valor2, resultado
				);
		
		entrada.close();
	}

}
