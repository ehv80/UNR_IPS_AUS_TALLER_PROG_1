public class ieeeremainder{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo de IEEEremainder");

		double x1 = 10;
		double x2 = 7;
                              double resultado = Math.IEEEremainder(x1,x2) ; 
                              c.println(resultado);
                              /* El multiplo de 7 más cercano a 10 es 7 (7*1=7) , luego 
	                   IEEEremainder(10,7) = 10 - 7 = 3.0 */

                              x1 = 27;
                              x2 = 7;
	               resultado = Math.IEEEremainder(x1,x2) ; 
                              /* El multiplo de 7 más cercano a 27 es 28 (7*4=28) , luego 
	                   IEEEremainder(27,7) = 27 - 28 = -1.0 */
                              c.println(resultado);

                              x1 = 38;
                              x2 = 19;
	               resultado = Math.IEEEremainder(x1,x2) ; 
                              /* El multiplo de 19 más cercano a 38 es 38 (19*2=38) , luego 
	                   IEEEremainder(27,7) = 38 - 38= 0.0 */
                              c.println(resultado);

                              x1 = -13;
                              x2 =  19;
	               resultado = Math.IEEEremainder(x1,x2) ; 
                              /* El multiplo de 19 más cercano a -13 es -19 (19*-1=-19) , luego 
	                   IEEEremainder(-13,19) = -13 - (-19)= 6.0 */
                              c.println(resultado);
	}
}
