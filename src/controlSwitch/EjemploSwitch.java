/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlSwitch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 8cho8888
 */
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String dayString;
Scanner entrada = new Scanner(System.in); 
     
        // instrucción switch con tipo de datos int
System.out.println("Escribe una opción");
        System.out.println("1.-Lunes  2.-Martes 3.-Miercoles 4.-Jueves 5.-Viernes 6.-Sabado 7.-Domingo");
        try{
        int dia = entrada.nextInt();
    
switch (dia) 
        {
            case 1:  dayString = "Lunes";
                     break;
            case 2:  dayString = "Martes";
                     break;
            case 3:  dayString = "Miercoles";
                     break;
            case 4:  dayString = "Jueves";
                     break;
            case 5:  dayString = "Viernes";
                     break;
            case 6:  dayString = "Sabado";
                     break;
            case 7:  dayString = "Domingo";
                     break;
            default: dayString = "Dia inválido";
                     break;
        }
        System.out.println(dayString);
        }catch(InputMismatchException e){
            System.out.println("Introduce un número porfavor");
}
    }
}

    
    

