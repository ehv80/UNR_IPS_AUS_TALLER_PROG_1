public class Cafetera{
	
	//String[] opciones = new String[ 6 ] ;
	
	//opciones[ 0 ] = "las opciones válidas para la Cafetera son las siguientes: " ;
	//opciones[ 1 ] = "CORTADO" ;
	//opciones[ 2 ] = "CAFÉ CON LECHE" ;
	//opciones[ 3 ] = "CAFÉ" ;
	//opciones[ 4 ] = "LÁGRIMA" ;
	//opciones[ 5 ] = "CAPUCHINO" ;
	
	public static String op1 = "Cortado" ;
	public static String op2 = "Cafe con Leche" ;
	public static String op3 = "Cafe" ;
	public static String op4 = "Lagrima" ;
	public static String op5 = "Capuchino" ;

	public static void mostrarOpcionElegida( int elegido ) {
		if ( elegido >= 1 && elegido <= 5 ) {
			switch( elegido ) {
				case 1 : 
				// System.out.println("Usted eligió la opción 1 correspondiente a: " + opciones[ 1 ] );
					 System.out.println("Ha elegido la opción 1 correspondiente a: " + Cafetera.op1 );
					 break;
				case 2 :
				// System.out.println("Usted eligió la opción 2 correspondiente a: " + opciones[ 2 ] );
					 System.out.println("Ha elegido la opción 2 correspondiente a: " + Cafetera.op2 );
					 break;
				case 3 :
				// System.out.println("Usted eligió la opción 3 correspondiente a: " + opciones[ 3 ] );
					 System.out.println("Ha elegido la opción 3 correspondiente a: " + Cafetera.op3);
					 break;
				case 4 :
				// System.out.println("Usted eligió la opción 4 correspondiente a: " + opciones[ 4 ] );
					 System.out.println("Ha elegido la opción 4 correspondiente a: " + Cafetera.op4 );
					 break;
				case 5 :
				// System.out.println("Usted eligió la opción 5 correspondiente a: " + opciones[ 5 ] );
					 System.out.println("Ha elegido la opción 5 correspondiente a: " + Cafetera.op5 );
					 break;
				default :
					 System.out.println("Usted eligió una opción inválida..! " );
					 break;
			}
		}
		else
		{
		 	System.out.println("Usted eligió una opción inválida..! " );
		 	//System.out.println("Observe que " + opciones[ 0 ] );
		 	//System.out.println("	1	{ " + opciones[ 1 ] + " }" );
		 	//System.out.println("	2	{ " + opciones[ 2 ] + " }" );
		 	//System.out.println("	3	{ " + opciones[ 3 ] + " }" );
		 	//System.out.println("	4	{ " + opciones[ 4 ] + " }" );
		 	//System.out.println("	5	{ " + opciones[ 5 ] + " }" );
		}
	}
}
