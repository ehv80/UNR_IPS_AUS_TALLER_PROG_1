
public class coseno{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de Funciones Trigonométricas");
		double x1 = 0;
                              double resultado = Math.cos(x1) ; //retorna 1.0 pues coseno(0)=1
                              c.println(resultado);
                              x1 = Math.PI;                                     
                              resultado = Math.cos(x1) ;     //retorna -1.0 pues coseno(PI)=-1
                              c.println(resultado);
                              x1 = 0.5;
                              resultado = Math.cos(x1) ;    // retorna coseno(0.5)=0.8775825...
                              c.println(resultado);
                              x1 = x1+2*Math.PI; 
                              resultado = Math.cos(x1) ;    // retorna coseno(0.5) , pues la función coseno
                              c.println(resultado);	         //es cíclica en 2*PI

                         
                          
	}
}
