public class round2{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo sobre función round");
		double x1 = 0.2;
                              float resultado = Math.round(x1) ; //retorna 0.0
                              c.println(resultado);
                              x1 = 1.5;                                     
                              resultado = Math.round(x1) ;     //retorna 2.0
                              c.println(resultado);
                              x1 = -10.7;
                              resultado = Math.round(x1) ;    // retorna -11.0
                              c.println(resultado);
                              x1 = -3;
                              resultado = Math.round(x1) ;    // retorna -3.0
                              c.println(resultado);
                              x1 = -3.3E24;
                              resultado = Math.round(x1) ;    // retorna el menor valor negativo posible	
                              c.println(resultado);                    // para representable por el tipo double . 

	}
}
