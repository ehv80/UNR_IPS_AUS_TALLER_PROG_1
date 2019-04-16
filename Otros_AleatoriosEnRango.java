/** Genera número aleatorios (enteros) que están entre un mínimo y un máximo **/
public class AleatoriosEnRango{
	public int GenerarAleatoriosEnRango( int min , int max ){
		int rango = max - min;
		int aleat = min + 1 + (int) ( rango * ( Math.random() ) ) ;
		return aleat;
	}
}
