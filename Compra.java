package oo.composiçao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> Itens = new ArrayList<Item>();
	
	
	double getvalorTotal() {
		double total  = 0;
		
		for(Item item: Itens) {
			total += item.quantidade * item.preço;
		}
		
		return total;
	}

}
