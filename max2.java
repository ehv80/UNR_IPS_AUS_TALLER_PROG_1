public class max{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de la función Máximo");
		double x1 = 1.3;
                              double x2 = -3;
                              double resultado1 = Math.max(x1,x2);//retorna 1.3
                              c.println(resultado1);
                              x1 = -3;
                              x2 = -3;
                              resultado1 = Math.max(x1,x2);//retorna -3.0
                              c.println(resultado1);
		//tambien existe la función max para los tipos float,int y long.

	}
}
