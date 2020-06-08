/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlWhile;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 8cho8888
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero de inico");
        try{  int contador = entrada.nextInt();
       System.out.println("Introduce un numero mayor al primer numero introducido");
        int finNo = entrada.nextInt();
        if(contador < finNo){
              while ( contador <= finNo ) {
          System.out.println("\n"+contador);
          contador++;
       }
        }else if(contador == finNo){
            System.out.println(""+contador+" Es igual a "+finNo);
        }else{
            System.out.println(""+contador+" Es mayor a "+finNo);
        }
            
        }catch(InputMismatchException e){
            System.out.println("Introduce un número por favor, suerte para la proxima");
        }
      
       
    
      
    }
    
}
