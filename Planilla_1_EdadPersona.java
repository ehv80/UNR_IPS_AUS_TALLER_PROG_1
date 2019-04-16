public class EdadPersona{
	
	public static void mostrarEdadAños( int edad ){
		System.out.println( "Esta persona tiene " + edad + " años" ) ;
	}

	public static void mostrarEdadDias( int edad ) {
		int dias = edad*365;
		System.out.println("La edad de esta persona es " + edad + " y equivale a " + dias + " dias " );
	}

	public static void mostrarEdadMinutos( int edad ) {
		double minutos = (double)edad * 365.0 * 24.0 * 60.0 ;
		System.out.println("La edad de esta persona es " + edad + " y equivale a " + minutos + " minutos " );
	}
	
	public static void mostrarEdadSegundos( int edad ){
		double segundos = (double)edad * 365.0 * 24.0 * 60.0 * 60.0 ;
		System.out.println("La edad de esta persona es " + edad + " y equivale a " + segundos + " segundos " );
	}
	
	public static void mostrarEdadMilisegundos( int edad ){
		double mili = (double)edad * 365.0 * 24.0 * 60.0 * 60.0 * 1000.0 ;
		System.out.println("La edad de esta persona es " + edad + " y equivale a " + mili + " milisegundos " );
	}

	public static int edad;
	//public static void EdadPersona(){
	//	 EdadPersona.edad = ( (int)( Math.random() * 100.0 ) + 1 ) ;
	//}
}
