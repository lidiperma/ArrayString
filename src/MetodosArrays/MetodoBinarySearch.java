
package MetodosArrays;

 import java.util.Arrays;
public class MetodoBinarySearch {
    
public static void main(String[] args) {

   // initializing unsorted int array
   int numeros[] = {30,20,5,12,55};

   // sorting array
   Arrays.sort(numeros);

   // let us print all the elements available in list
   System.out.println("The sorted int array is:");
   for (int number : numeros) {
   System.out.println("Number = " + number);
   }

   // entering the value to be searched
   int searchVal = 12;

   int retVal = Arrays.binarySearch(numeros,searchVal);
	
   System.out.println("The index of element 12 is : " + retVal);
   }

    
}
