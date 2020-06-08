/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlIf;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EjemploIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.println("Escribe el valor de A");
        int a = entrada.nextInt();
        System.out.println("Escribe el valor de B");
        int b = entrada.nextInt();
        if(a > b){
            System.out.println("A es mayor que B");
        }else if (b==a){
            System.out.println("Son de igual valor ambos");
            
        }else{
            System.out.println(" B es mayor que A");
        }
        } catch(InputMismatchException e){
            System.out.println("No seas baboso introduce un numero");
            
        }
      
    }
}
