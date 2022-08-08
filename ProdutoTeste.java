package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notbook", 4356.89);
	
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preço = 12.56;
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double preçoFinal1 = p1.preço * (1 - p1.desconto);
		double preçoFinal2 = p2.preço * (1 - p2.desconto);
		double mediaCarrinho = (preçoFinal1 + preçoFinal2)/2;
		
		System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
	}

}
