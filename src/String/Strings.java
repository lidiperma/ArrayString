
package String;

import java.util.Date;


public class Strings {

    
    public static void main(String[] args) {
        
    String texto1 = "prueba de texto"; 
    String texto2 ="este es un texto que ocupa" + "varias líneas, no obstante se puede "+ "perfectamente encadenar";     
    char[] palabra = {'P','a','l','b','r','a'};//Array de char 
    String cadena = new String(palabra); 
    byte[] datos = {97,98,99}; 
    String numero = String.valueOf(1234); 
    String fecha = String.valueOf(new Date());
    char c1=texto1.charAt(5);//Devuelve la posición que indica el numero del charAt
    //String codificada = new String (datos, "8859_1"); 
    String textoDoble="prueba de texto";
    String texto3="Esta es una pruba de texto";
    
    
    System.out.println(texto1);
    System.out.println(texto2);
    System.out.println(palabra);
    System.out.println(cadena);
    System.out.println(datos);
    System.out.println(numero);
    System.out.println(fecha);
    System.out.println(texto1.length());//Devuelve el numero de caracteres de la cadena
    System.out.println(c1);
    System.out.println(texto2.substring(7,10));
    System.out.println(texto1.indexOf("de"));
    System.out.println(texto1.lastIndexOf("Prue"));
    System.out.println(texto1.endsWith("texto"));
    System.out.println(texto1.startsWith("Prueba"));
    System.out.println(texto1.replace('u','e'));
    //System.out.println(texto2.replace('es','as'));
     
    }
    
	
}
