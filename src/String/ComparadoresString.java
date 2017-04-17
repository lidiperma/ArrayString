
package String;


public class ComparadoresString {
    
    public static void main(String[] args){               
        String texto1 = "prueba de texto";
        String texto2= "Prueba de TExto";      
        String textoDoble="prueba de texto";      
        String texto3="Esta es una pruba de texto";           
        //Comparador compareTo de String     
        System.out.println(texto1.compareTo(textoDoble)); //ixmprime '0' porque ambos son iguales     
        System.out.println(texto1.compareTo(texto3));//imprime un entero       
        //Comparador equals de String     
        if (texto1.equals(textoDoble)){       
            System.out.println("Texto1 y TextoDoble son iguales");
        }     else{     System.out.println("Texto1 y Texto3 son distintas"); }         
        //Comparador compareToIgnoreCase     
        System.out.println(texto1.compareToIgnoreCase(texto2));     
            if (texto1.equalsIgnoreCase(texto2)){        
            System.out.println("Texto1 y Texto2 son iguales");}     
        else{     System.out.println("Texto1 y Texto3 son distintas");} 
    
}
}
