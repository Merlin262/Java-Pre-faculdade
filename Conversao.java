package pratica;

import java.util.Scanner;

public class Conversao {
	
	Scanner entrada = new Scanner(System.in);

	float valor1;
	float valorFinal1;
	float valor2;
	float valorFinal2;
	
	public static float opçao1(int opçao1){
		
		Scanner entrada = new Scanner(System.in);
		
		float valor1;
		float valorFinal1;
		
		System.out.println("Informe o valor a ser convertido para mestros");
		valor1 = entrada.nextFloat();
		
		valorFinal1 = (valor1/100);
		
		System.out.printf("O valor em metros eh: %f ", valorFinal1, "m");
		entrada.close();
		return valorFinal1;
		}
	
	public static float opçao2(int opçao2){
		
		Scanner entrada = new Scanner(System.in);
		
		float valor2;
		float valorFinal2;
		
		System.out.println("Informe o valor a ser convertido para kilomestros");
		valor2 = entrada.nextFloat();
		
		valorFinal2 = (valor2/1000);
		
		System.out.printf("O valor em kilometros eh: %f ", valorFinal2, "Km");
		
		entrada.close();
		return valorFinal2;
	}
	
public static float opçao3(int opçao3){
		
		Scanner entrada = new Scanner(System.in);
		
		float valor3;
		float valorFinal3;
		
		System.out.println("Informe o valor a ser convertido de celsus para fahrenheit");
		valor3 = entrada.nextFloat();
		
		valorFinal3 = (((valor3*9)/5)+32);
		
		System.out.printf("O valor em fahrenheit eh: %f ", valorFinal3, "ºF");
		
		entrada.close();
		return valorFinal3;
	}
	
}
