public class arcos{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de Funciones Trigonométricas");
		double x1 = 0;
                              double resultado = Math.acos(x1) ; //retorna 1.57079... pues acos(0)=PI/2
                              c.println(resultado);
                              x1 = 1;                                     
                              resultado = Math.acos(x1) ;     //retorna 0.0 pues acos(1)=0 
                             c.println(resultado);
                              x1 = - 1.00001;
                              resultado = Math.acos(x1) ;    // para valores cuyo modulo sea mayor	
                              c.println(resultado);                  // que 1 , retorna NaN (indefinido)
                                                   
	}
}
