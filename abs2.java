public class abs{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de la función Valor Absoluto");
		double x1 = 1.3;
                              int x2 = -3;
                              float x3 = -6;
                              double resultado1 = Math.abs(x1);// siempre el resultado de la funcion
                              int resultado2 = Math.abs(x2);        // tiene el mismo tipo del argumento.
                              float resultado3 = Math.abs(x3);
                              c.println(resultado1+" "+resultado2+" "+resultado3);
	}
}
