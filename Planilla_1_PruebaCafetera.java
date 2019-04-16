public class PruebaCafetera{
	public static void main(String[] args){
		Cafetera miCafetera = new Cafetera();
		
		System.out.println("TESTEO DEL FUNCIONAMIENTO DE LA CLASE Cafetera y sus MÉTODOS: ");
		for ( int i=1 ; i<=5 ; i++ ) {
			int elegido = i;
			miCafetera.mostrarOpcionElegida( elegido ) ;
		}
	}
}
		
