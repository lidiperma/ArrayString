
package MetodosArrays;



import java.util.Arrays; 
 
public class MetodoArraySort{ 
 
 
    public static void main(String[] args) { 
        //Array de String         
        int[] numeros = {4, 2, 6, -3, 10, 11, 166, 1};
        //Ordena el array         
        Arrays.sort(numeros);           
        //Mostramos el array ya ordenado         
        for (int i : numeros) {             
            System.out.print( i + ", ");         
        }     
    }
} 
    

