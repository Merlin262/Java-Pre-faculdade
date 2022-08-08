package classe;

public class areaCircunferencia {
	
	double raio;
	static double PI = 3.14;
	
	areaCircunferencia(double raioInicial) {
		raio = raioInicial; 
	}
	
	double area() {
		return Math.pow(raio, 2)* PI;
	}

}
