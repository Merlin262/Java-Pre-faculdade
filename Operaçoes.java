package pratica;

import java.util.Scanner;
import java.lang.Math;

public class Operaçoes {
	
	public static void main(String[] args) {
		
		Conversao op1 = new Conversao();
		
		int opçao;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escolha a conversão:"
				+ "\n -1 - sair do programa "
				+ "\n 1 - centimetro para metro "
				+ "\n 2 - merto para kilometro "
				+ "\n 3 celsus para Fahrenheit");
		opçao = entrada.nextInt();
		
		if(opçao==1) {
			op1.opçao1(1);
		}else if(opçao==2){
			op1.opçao2(2);
		}else if(opçao==-1) {
			System.out.println("Obrigado por participar");;
		}else if(opçao==3){
			op1.opçao3(3);
		}

		entrada.close();

	}

}
