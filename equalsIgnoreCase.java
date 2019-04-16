public class equalsIgnoreCase{
	public static void main (String args[])
	{Console c = new Console();
                 boolean valor;
	  c.println ("Ejemplo de uso de equals ignorando mayusculas");
                String str="HoLa MuNdo";
                 valor=str.equalsIgnoreCase("hOLa mUnDO"); // retorna true,pues compara los caracteres
                  if (valor==true) 		                                // ignorando las mayusculas
                       {c.println("son iguales");}
                  else
                       {c.println("son diferentes");}
                }
}
