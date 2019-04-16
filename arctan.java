public class arctan{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de Funciones Trigonométricas");
		double x1 = 0;
                              double resultado = Math.atan(x1) ; //retorna 0.0 pues atan(0)=0
                              c.println(resultado);
                              x1 = 1000;                                     
                              resultado = Math.atan(x1) ;     //retorna 1.5697... pues atan(1000)
                              c.println(resultado);                  //tiende a PI/2
                              x1 = -1000;                                     
                              resultado = Math.atan(x1) ;     //retorna -1.5697... pues atan(-1000)
                              c.println(resultado);                  //tiende a -PI/2
   	}
}
