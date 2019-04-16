/** Ejemplo de ejecución de la clase Ej5 que manipula
    las temperaturas máximas registradas para cada día
    del año en arreglos para cada mes		     **/

public class PruebaEj5{

	public static void main(String[] args){

		Ej5 prueba = new Ej5();

		prueba.inicializarNombresMeses();

		prueba.inicializarMeses();

		prueba.mostrarTemp ( prueba.Enero , 0 );
		prueba.mostrarTemp ( prueba.Febrero , 1 );
		prueba.mostrarTemp ( prueba.Marzo , 2 );
		prueba.mostrarTemp ( prueba.Abril , 3 );
		prueba.mostrarTemp ( prueba.Mayo , 4 );
		prueba.mostrarTemp ( prueba.Junio , 5 );
		prueba.mostrarTemp ( prueba.Julio , 6 );
		prueba.mostrarTemp ( prueba.Agosto , 7 );
		prueba.mostrarTemp ( prueba.Septiembre , 8 );
		prueba.mostrarTemp ( prueba.Octubre , 9 );
		prueba.mostrarTemp ( prueba.Noviembre , 10 );
		prueba.mostrarTemp ( prueba.Diciembre , 11 );

		prueba.mostrarTempPromedio( prueba.Enero , 0 );
		prueba.mostrarTempPromedio( prueba.Febrero , 1 );
		prueba.mostrarTempPromedio( prueba.Marzo , 2 );
		prueba.mostrarTempPromedio( prueba.Abril , 3 );
		prueba.mostrarTempPromedio( prueba.Mayo , 4 );
		prueba.mostrarTempPromedio( prueba.Junio , 5 );
		prueba.mostrarTempPromedio( prueba.Julio , 6 );
		prueba.mostrarTempPromedio( prueba.Agosto , 7 );
		prueba.mostrarTempPromedio( prueba.Septiembre , 8 );
		prueba.mostrarTempPromedio( prueba.Octubre , 9 );
		prueba.mostrarTempPromedio( prueba.Noviembre , 10 );
		prueba.mostrarTempPromedio( prueba.Diciembre , 11 );
	}
}
