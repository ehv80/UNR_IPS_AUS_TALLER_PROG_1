
public class logaritmo{
	public static void main (String args[])
	{
		Console c = new Console();
		c.println ("Ejemplo sobre función logaritmo");
		double x1 = 0;
                              double resultado = Math.log(x1) ; //retorna -infinity,pues exp(X)=0
						    //cuando X tiende a - infinito
                              c.println(resultado);
                              x1 = Math.E;                                     
                              resultado = Math.log(x1) ;     //retorna 1.0 pues ln(e)=1
                              c.println(resultado);
                              x1 =-100;
                              resultado = Math.log(x1) ;    // retorna indefinido, pues el argumento
					        // de entrada siempre debe ser no negativo.
                              c.println(resultado);
	}
}
