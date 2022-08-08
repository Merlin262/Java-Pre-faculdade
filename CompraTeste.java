package oo.composiçao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra c1 =new Compra();
		c1.cliente = "João Pedro";
		c1.Itens.add(new Item("Caneta", 20, 7.45));
		c1.Itens.add(new Item("Borrahca", 12, 3.89));
		c1.Itens.add(new Item("Caderno", 3, 18.79));
		
		
		System.out.println(c1.Itens.size());
		System.out.println(c1.getvalorTotal());
	}

}
