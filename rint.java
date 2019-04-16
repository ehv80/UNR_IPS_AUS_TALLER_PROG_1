
public class rint{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo sobre función rint");
		double x1 = 0.2;
                              double resultado = Math.rint(x1) ; //retorna 0.0
                              c.println(resultado);
                              x1 = 1.5;                                     
                              resultado = Math.rint(x1) ;     //retorna 2.0
                              c.println(resultado);
                              x1 = -10.7;
                              resultado = Math.rint(x1) ;    // retorna -11.0
                              c.println(resultado);
                              x1 = -3;
                              resultado = Math.rint(x1) ;    // retorna -3.0
                              c.println(resultado);
                    
	}
}
