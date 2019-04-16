/** Clase que almacena las temperaturas máximas de cada día del año
    en un arreglo. Debe tener los siguientes métodos:
    - para crear e inicializar el arreglo con temperaturas aleatorias
      de acuerdo al siguiente detalle:
        - meses 1, 2, 3 y 4 entre 20 y 37ºC
	- meses 5, 6, 7 y 8 entre 5  y 20ºC
	- meses 9, 10, 11 y 12 entre 20 y 30ºC
    - para mostrar las temperaturas de cada día del mes indicado
    - para mostrar la temperatura promedio del mes indicado      **/
public class Ej5{
	
	String[] Meses = new String[12];

	double[] Enero = new double[31];
	double[] Febrero = new double[28];
	double[] Marzo = new double[31];
	double[] Abril = new double[30];

	double[] Mayo = new double[31];
	double[] Junio = new double[30];
	double[] Julio = new double[31];
	double[] Agosto = new double[31];

	double[] Septiembre = new double[30];
	double[] Octubre = new double[31];
	double[] Noviembre = new double[30];
	double[] Diciembre = new double[31];

	public double Aleatorio1a4(){
			double rango = 37.0 - 20.0;
			double aleat = 20.0 + 1.0 + ( double )( rango * Math.random() );
			return aleat;
	}
	public double Aleatorio5a8(){
			double rango = 20.0 - 5.0;
			double aleat = 5.0 + 1.0 + ( double )( rango * Math.random() );
			return aleat;
	}
	public double Aleatorio9a12(){
			double rango = 30.0 - 20.0;
			double aleat = 20.0 + 1.0 + ( double )( rango * Math.random() );
			return aleat;
	}	
	public void inicializarNombresMeses(){
		Meses[0] = "Enero";
		Meses[1] = "Febrero";
		Meses[2] = "Marzo";
		Meses[3] = "Abril";
		Meses[4] = "Mayo";
		Meses[5] = "Junio";
		Meses[6] = "Julio";
		Meses[7] = "Agosto";
		Meses[8] = "Septiembre";
		Meses[9] = "Octubre";
		Meses[10] = "Noviembre";
		Meses[11] = "Diciembre";
	}
	public void inicializarMeses(){

		for( int i=0 ; i < Enero.length ; i++ )		//Mes 1
			Enero[i] = Aleatorio1a4();
		
		for( int i=0 ; i < Febrero.length ; i++ )	//Mes 2
			Febrero[i] = Aleatorio1a4();
		
		for( int i=0 ; i < Marzo.length ; i++ )		//Mes 3
			Marzo[i] = Aleatorio1a4();
		
		for( int i=0 ; i < Abril.length ; i++ )		//Mes 4
			Abril[i] = Aleatorio1a4();
		
		for( int i=0 ; i < Mayo.length ; i++ )		//Mes 5 
			Mayo[i] = Aleatorio5a8();

		for( int i=0 ; i < Junio.length ; i++ )		//Mes 6 
			Junio[i] = Aleatorio5a8();

		for( int i=0 ; i < Julio.length ; i++ )		//Mes 7 
			Julio[i] = Aleatorio5a8();

		for( int i=0 ; i < Agosto.length ; i++ )	//Mes 8 
			Agosto[i] = Aleatorio5a8();

		for( int i=0 ; i < Septiembre.length ; i++ )	//Mes 9 
			Septiembre[i] = Aleatorio9a12();

		for( int i=0 ; i < Octubre.length ; i++ )	//Mes 10 
			Octubre[i] = Aleatorio9a12();

		for( int i=0 ; i < Noviembre.length ; i++ )	//Mes 11 
			Noviembre[i] = Aleatorio9a12();

		for( int i=0 ; i < Diciembre.length ; i++ )	//Mes 12 
			Diciembre[i] = Aleatorio9a12();
	}
	public void mostrarTemp( double[] mes , int k ){ // k es indice del arreglo Meses[] correspondiente al mes dado
	   System.out.println("Las temperaturas registradas durante el mes de " + Meses[k] + " fueron las siguientes:" );
	      for( int i=0 ; i < mes.length ; i++ ){
		int j = i + 1;
		System.out.println("Para el día " + j + " : " + mes[i] );
	      }
	}
	public void mostrarTempPromedio( double[] mes , int k ){ //k es el índice del arreglo Meses[] de ese mes dado
		double suma = 0.0;
		for( int i=0 ; i < mes.length ; i++ )
			suma = suma + mes[i];
		double promedio = suma / ( double )( mes.length );
		System.out.println("La temperatura promedio para el mes de " + Meses[k] + " es de: " + promedio );
	}
}
