package classe;

public class Produto {
	
	String nome;
	double preço;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double preçoInicial){
		
		nome = nomeInicial;
		preço = preçoInicial;
	}
	
	double preçoComDesconto() {
		return preço * (1 - desconto);
	}
	
	double preçoComDesconto(double descontoDoGerente) {
		return preço * (1 - descontoDoGerente);
	}
	
}
