public class equals{
	public static void main (String args[])
	{Console c = new Console();
                 boolean valor;
	  c.println ("Ejemplo de uso de equals");
                String str="hola mundo";
                 valor=str.equals("Chao"); // retorna false ,pues str es distinto de "Chao"
                  if (valor==true) 
                       {c.println("son iguales");}
                  else
                       {c.println("son diferentes");}
                }
}
