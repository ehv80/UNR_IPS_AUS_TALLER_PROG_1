public class PruebaCafeteraB{
	public static void main(String[] args){
		CafeteraB miCafetera = new CafeteraB();
		
		System.out.println("TESTEO DEL FUNCIONAMIENTO DE LA CLASE CafeteraB y sus MÉTODOS: ");
		System.out.println("Para 1 <= opción_elegida <= 6 : ");
		for ( int i=1 ; i<=6 ; i++ ) {
			int elegido = i;
			miCafetera.mostrarOpcionElegida( elegido ) ;
		}
		System.out.println("Para 6 <= opción_elegida <= 10 : ");
		for ( int i=6 ; i<=10 ; i++ ) {
			int elegido = i;
			miCafetera.mostrarOpcionElegida( elegido ) ;
		
		}
	}
}
		
