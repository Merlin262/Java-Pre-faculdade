package fundamentos;

public class operadores {
	
	public static void main(String[] args) {
		
		double nota = 6.9;
		
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Nao.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}

}
