
public class tangente{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de Funciones Trigonométricas");
		double x1 = 0;
                              double resultado = Math.tan(x1) ; //retorna 1.0 pues tan(0)=0
                              c.println(resultado);
                              x1 = Math.PI/2+0.0001;                                     
                              resultado = Math.tan(x1) ;     //recordar que tan(PI/2) tiende a infinito...
                              c.println(resultado);
                              x1 = 10;
                              resultado = Math.tan(x1) ;    // retorna tan(0.5)=0.546302...
                              c.println(resultado);
                              x1 = x1+Math.PI; 
                              resultado = Math.tan(x1) ;    // retorna  tan(0.5) , pues la función 
                              c.println(resultado);	         //tangente es cíclica en PI                     
                          
	}
}
