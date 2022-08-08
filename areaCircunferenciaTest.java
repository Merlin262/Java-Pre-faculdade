package classe;

public class areaCircunferenciaTest {
	
	public static void main(String[] args) {
		
		areaCircunferencia a = new areaCircunferencia(10);
		
		System.out.println(a.area());
		
		areaCircunferencia a1 = new areaCircunferencia(5);
		
		System.out.println(a1.area());
		System.out.println(areaCircunferencia.PI);
		System.out.println(Math.PI);
	}

}
