public class CafeteraB{
	
	//public static String[] opciones = new String[7] ;
	
	//opciones[0] = "las opciones válidas para la Cafetera son las siguientes: " ;
	//opciones[1] = "CORTADO" ;
	//opciones[2] = "CAFÉ CON LECHE" ;
	//opciones[3] = "CAFÉ" ;
	//opciones[4] = "LÁGRIMA" ;
	//opciones[5] = "CAPUCHINO" ;
	
	//opciones[6] = "CHOCOLATADA" ;
	
	public static String op1 = "Cortado" ;
	public static String op2 = "Cafe con Leche" ;
	public static String op3 = "Cafe" ;
	public static String op4 = "Lagrima" ;
	public static String op5 = "Capuchino" ;

	public static String op6 = "Chocolatada" ;

	public static void mostrarOpcionElegida( int elegido ) {
		if ( elegido >= 1 && elegido <= 6 ) {
			switch( elegido ) {
				case 1 : 
		 	//System.out.println("Usted eligió la opción 1 correspondiente a: " + CafeteraB.opciones[1] );
					System.out.println("Ha elegido la opción 1 correspondiente a: " + CafeteraB.op1 );
					break;
				case 2 :
			//System.out.println("Usted eligió la opción 2 correspondiente a: " + CafeteraB.opciones[2] );
					System.out.println("Ha elegido la opción 2 correspondiente a: " + CafeteraB.op2 );
					break;
				case 3 :
			//System.out.println("Usted eligió la opción 3 correspondiente a: " + CafeteraB.opciones[3] );
					System.out.println("Ha elegido la opción 3 correspondiente a: " + CafeteraB.op3 );
					break;
				case 4 :
			//System.out.println("Usted eligió la opción 4 correspondiente a: " + CafeteraB.opciones[4] );
					System.out.println("Ha elegido la opción 4 correspondiente a: " + CafeteraB.op4 );
					break;
				case 5 :
			//System.out.println("Usted eligió la opción 5 correspondiente a: " + CafeteraB.opciones[5] );
					System.out.println("Ha elegido la opción 5 correspondiente a: " + CafeteraB.op5 );
					break;
				case 6 :
			//System.out.println("Usted eligió la opción 6 correspondiente a: " + CafeteraB.opciones[6] );
					System.out.println("Ha elegido la opción 6 correspondiente a: " + CafeteraB.op6 );
					break;
				default :
					 System.out.println("Usted eligió una opción inválida..! " );
					 break;
			}
		}
		else
		{
		 	System.out.println("Usted eligió una opción inválida..! " );
		 	//System.out.println("Observe que " + CafeteraB.opciones[0] );
		 	//System.out.println("	1	{ " + CafeteraB.opciones[1] + " }" );
		 	//System.out.println("	2	{ " + CafeteraB.opciones[2] + " }" );
		 	//System.out.println("	3	{ " + CafeteraB.opciones[3] + " }" );
		 	//System.out.println("	4	{ " + CafeteraB.opciones[4] + " }" );
		 	//System.out.println("	5	{ " + CafeteraB.opciones[5] + " }" );
		}
	}
}
