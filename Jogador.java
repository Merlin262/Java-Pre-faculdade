package oo.herança;

public class Jogador {
	
	int vida = 100;
	int x;
	int y;
	
	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x-oponente.x);
		int deltaY = Math.abs(y-oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
		}else {
			return false;
		}
		
		
		return true;
	}
	
	boolean andar(Direção direção) {
		switch(direção) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}

}
