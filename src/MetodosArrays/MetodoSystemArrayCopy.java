
package MetodosArrays;

//import EjemploSystem.*;
import java.lang.*;
public class MetodoSystemArrayCopy {
  
    public static void main(String[] args) {

     
      int uno[]={1,1,2};
      int dos[]={3,3,3,3,3,3,3,3,3}; 
      System.arraycopy(uno, 0, dos, 0, uno.length); 
      for (int i=0;i<=8;i++){     
          System.out.print(dos[i]+" "); } 
   }
}

