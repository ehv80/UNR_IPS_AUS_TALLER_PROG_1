public class PruebaEdadPersona{
	public static void main(String[] args){
		
		EdadPersona miEdadPersona = new EdadPersona();
		
		System.out.println("Clase de prueba del funcionamiento de los métodos de la clase EdadPersona: " ) ;
		
		for ( int i=1 ; i<=100 ; i++ ) {

			miEdadPersona.edad = i ; 

			miEdadPersona.mostrarEdadAños( miEdadPersona.edad );

			miEdadPersona.mostrarEdadDias( miEdadPersona.edad );

			miEdadPersona.mostrarEdadMinutos( miEdadPersona.edad );
		
			miEdadPersona.mostrarEdadSegundos( miEdadPersona.edad );
			
			miEdadPersona.mostrarEdadMilisegundos( miEdadPersona.edad );
		}
	}
}
		
