public class PruebaAleatoriosEnRango{

	public static void main(String[] args){

		AleatoriosEnRango miAleatorio = new AleatoriosEnRango();
		
		int resultado = miAleatorio.GenerarAleatoriosEnRango ( 1 , 10 );
		
		System.out.println( "El aleatorio entre 1 y 10 es: " + resultado ) ;
	}
}

