public class compareTo{
	public static void main (String args[])
	{Console c = new Console();
                 int i;
	  c.println ("Ejemplo de uso de compareTo");
                String str="Hola";
                 i=str.compareTo("hola");  // retorna un valor negativo  pues Hola es 
                c.println(i);		       // menor lexicograficamente que hola 
				       // pues los valores de los caracteres con mayuscula
				       // son menores que los caracteres en minuscula.
                 i=str.compareTo("Hola"); // retorna  0 pues son iguales
                c.println(i);
                 i=str.compareTo("Chao"); // retorna un valor positivo.
                c.println(i);
                 i=str.compareTo("Mesa"); // retorna negativo.
                c.println(i);
                }
}
