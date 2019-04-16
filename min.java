public class min{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de la función Mínimo");
		double x1 = 1.3;
                              double x2 = -3;
                              double resultado1 = Math.min(x1,x2);//retorna -3.0
                              c.println(resultado1);
                              x1 = -3;
                              x2 = -3;
                              resultado1 = Math.min(x1,x2);//retorna -3.0
                              c.println(resultado1);
		//tambien existe la función min para los tipos float,int y long.

	}
}
