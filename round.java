public class round{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo sobre función round");
		float x1 =(float) 0.2;
                              int resultado = Math.round(x1) ; //retorna 0.
                              c.println(resultado);
                              x1 = (float)1.5;                                     
                              resultado = Math.round(x1) ;     //retorna 2.
                              c.println(resultado);
                              x1 =(float) -10.7;
                              resultado = Math.round(x1) ;    // retorna -11.
                              c.println(resultado);
                              x1 = -3;
                              resultado = Math.round(x1) ;    // retorna -3.
                              c.println(resultado);
                              x1 =(float) -3000000000.3;
                              resultado = Math.round(x1) ;    // retorna el menor valor negativo posible	
                              c.println(resultado);                    // para enteros . 

	}
}
