public class raiz{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo sobre la función raiz");
		double x1 = 0;
                              double resultado = Math.sqrt(x1) ; //retorna 0.0
                              c.println(resultado);
                              x1 = 16;                                     
                              resultado = Math.sqrt(x1) ;     //retorna 4.0
                              c.println(resultado);
                              x1 = -1;
                              resultado = Math.sqrt(x1) ;    // retorna indefinido pues el argumento
                              c.println(resultado);                // de la función sqrt debe ser no negativo
              
             }
}
