package oo.composiçao;

public class Motor {
	
	
	final Carro carro;
	boolean ligado = false;
	double fatorInjeçao = 1;
	
	Motor(Carro carro) {
		this.carro = carro;
	}
	
	int giros() {
		if(!ligado) {
		return 0;	
		}else {
		return (int) Math.round(fatorInjeçao * 3000);
		}
	}

}
