package oo.composiçao;

public class Carro {
	
	final Motor motor;
	
	Carro() {
		this.motor =  new Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorInjeçao < 2.6) {
		motor.fatorInjeçao += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorInjeçao > 0.5) {
			
		}
		motor.fatorInjeçao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}

}
