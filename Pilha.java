package Coleçoes;

import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {
	
	public static void main(String[] args) {
		
	Deque<String> livros = new ArrayDeque<String>();
	
	livros.add("O pequeno principe");
	livros.push("Don quixote");
	livros.push("Hobbit");
	
	System.out.println(livros.peek());
	System.out.println(livros.element());
	
	for(String livro: livros) {
		System.out.println(livro);
	}
	
	System.out.println(livros.pop());
	System.out.println(livros.poll());
	System.out.println(livros.poll());
	System.out.println(livros.poll());
	System.out.println(livros.poll());
	System.out.println(livros.pop());
	
	
	
	}
}
