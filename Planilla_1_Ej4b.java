public class Ej4b{
	public static void main(String[] args){
		double nroUno = 1.0;
		double nroDos = 1.0E-308;
		double res = nroUno / (nroDos * nroDos );
		System.out.println("El cociente entre " + nroUno + " y " + nroDos + " elevado al cuadrado " + " es: " + res );
	}
}
