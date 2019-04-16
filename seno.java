
public class seno{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de Funciones Trigonométricas");
		double x1 = 0;
                              double resultado = Math.sin(x1) ; //retorna 0.0 pues seno(0)=0
                              c.println(resultado);
                              x1 = Math.PI/2;                                     
                              resultado = Math.sin(x1) ;     //retorna 1.0 pues seno(PI/2)=1
                              c.println(resultado);
                              x1 = 0.5;
                              resultado = Math.sin(x1) ;    // retorna seno(0.5)=0.4794255...
                              c.println(resultado);
                              x1 = x1+2*Math.PI; 
                              resultado = Math.sin(x1) ;    // retorna seno(0.5) , pues la función seno
                              c.println(resultado);	        //es cíclica en 2*PI

                         
                          
	}
}
