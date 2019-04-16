public class hashcode{
	public static void main (String args[])
	{Console c = new Console();
                 int valor;
	  c.println ("Ejemplo de uso de hashCode");
                String str="Hola Mundo";
	 valor= str.hashCode();    // retorna el codigo hash para este string
                c.println(valor);		        
                }
}
