public class techo{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de la función techo");
		double x1 = 1.3;
                              double resultado = Math.ceil(x1) ; //retorna 2.0
                              c.println(resultado);
                              x1 = -2.9;                                     
                              resultado = Math.ceil(x1) ;     //retorna -2.0
                              c.println(resultado);      
	}
}
