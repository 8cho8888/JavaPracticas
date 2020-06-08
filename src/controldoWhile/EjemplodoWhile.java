/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldoWhile;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 8cho8888
 */
public class EjemplodoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
            int digito=0;
        System.out.println("Introdunce un numero");
        try{
            int numero = entrada.nextInt();

       do {
         numero /=10;
           System.out.println(""+numero);
           digito++;
      }
      while ( numero > 0 );
System.out.println("Llego hasta el digito "+digito);
        }catch(InputMismatchException e){
            System.out.println("Suerte para la proxima, introduce un número valido");
        }
       
    }
    
}
