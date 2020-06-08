/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlFor;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 8cho8888
 */
public class EjemploFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero de inicio");
        try{
            int noInicio = entrada.nextInt();
        System.out.println("Introduce el numero maximo");
        int noFinal = entrada.nextInt();
        System.out.println("Introduce una secuencia  Ejemplo De 2 en 2 o de 3 en 3");
     int secuencia= entrada.nextInt();
        System.out.println("Este es el resultado del número "+noInicio+" Al numero "+noFinal+" Con secuencia de "+secuencia+" En "+secuencia);
        for(int i=noInicio;i<=noFinal;i+=secuencia)
        {
            System.out.println(i);
        }
        }catch(InputMismatchException e){
            System.out.println("Suerte para la proxima que sepas que es un número");
        }
        
    }
    
}
