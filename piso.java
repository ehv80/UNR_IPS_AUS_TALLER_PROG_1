public class piso{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de la función piso");
		double x1 = 1.3;
                              double resultado = Math.floor(x1) ; //retorna 1.0
                              c.println(resultado);
                              x1 = -2.4;                                     
                              resultado = Math.floor(x1) ;     //retorna -3.0
                              c.println(resultado);      
	}
}
