public class Ej5a{
	public static void main(String[] args){
		double a = Math.random()*100.0 + 1.0 * Math.random() + 1.0;
		int b = (int) a;
		if ( b>=1 && b <= 100 )
			System.out.println("Un número aletorio entre 1 y 100 es : " + b );
		else
			System.out.println("El número obtenido no pertenece al intervalo [1,100] de números enteros...!!!");
			
	}
}
