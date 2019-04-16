public class pow{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo sobre la función Pow");
		double x1 = 2;
                              double x2 = 6;
                              double resultado = Math.pow(x1,x2) ; //retorna 64.0 
                              c.println(resultado);
                              x1 = 16.3;
                              x2=  0.5;                                     
                              resultado = Math.pow(x1,x2) ;     //retorna 4.0373...
                              c.println(resultado);
                              x1 = -8;
                              x2 = 2.5;
                              resultado = Math.pow(x1,x2) ;    // retorna indefinido pues si el primer
                              c.println(resultado);                // argumento de la función es negativo,
					         //  el segundo sólo puede ser entero.
              
             }
}
