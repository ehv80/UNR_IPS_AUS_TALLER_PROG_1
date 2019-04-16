public class exponencial{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo sobre función exponencial");
		double x1 = 0;
                              double resultado = Math.exp(x1) ; //retorna 1.0
                              c.println(resultado);
                              x1 = 1;                                     
                              resultado = Math.exp(x1) ;     //retorna e
                              c.println(resultado);
                              x1 = -10;
                              resultado = Math.exp(x1) ;    // retorna 4.539999E-5
                              c.println(resultado);
                                                 
	}
}
