/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlForeach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 8cho8888
 */
public class EjemploForeach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList <String> poetasUrbanos = new ArrayList<String> ();
        poetasUrbanos.add ("Horus"); 
        poetasUrbanos.add ("Lirika Inverza");
        poetasUrbanos.add ("Fase"); 
        poetasUrbanos.add ("Sharif");
        poetasUrbanos.add("Khan");
        int i = 0;

        System.out.println ("Estos son los poetas Urbanos del momento desconocido: ");

 

        for (String nombre : poetasUrbanos) {  
            System.out.println ((i+1) + ".- " +nombre);
            i++;  
                                            }
    }
    }
