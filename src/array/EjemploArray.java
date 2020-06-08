/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author 8cho8888
 */
public class EjemploArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here// declara un array de enteros.
      int[] arr;
         
      arr = new int[5];
      arr[0] = 10;
      arr[1] = 20;
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50;
         

      for (int i = 0; i < arr.length; i++)
         System.out.println("Elemento en el índice " + i + 
                                      " : "+ arr[i]); 
    }
    
}
