public class toCharArray{
	public static void main (String args[])
	{Console c = new Console();
	  c.println ("Ejemplo de uso de toCharArray");
                int i;
                String str="Hola Mundo";
                char valor[];
	 valor=str.toCharArray();       // el arreglo valor se llena con es string 
                for (i=0;i<str.length();i++)
                     c.print(valor[i]);  
                }		    
}
