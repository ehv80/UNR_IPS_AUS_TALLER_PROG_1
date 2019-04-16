/** Programa que crea un array que contiene la tabla de
    multiplicar desde el uno hasta el doce             **/
public class Ej3{
	int[][] tabla = new int[13][13];
	public void setearTabla(){
		for( int i = 1 ; i < tabla.length ; i++ ){
			for( int j = 1 ; j < tabla[0].length ; j++ ){
				tabla[i][j] = i*j;
				System.out.print( tabla[i][j] + "\t" );
			}
			System.out.println("");
		}
	}
	public static void main(String[] args){
		Ej3 prueba = new Ej3();
		prueba.setearTabla();
	}
}
		
