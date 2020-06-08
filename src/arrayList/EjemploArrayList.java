/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 8cho8888
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> nombres = new ArrayList();
       Scanner entrada = new Scanner(System.in);
     
    for(int i=0;i<=3;i+=1)
        {
            System.out.println(+i+".- Introduce un nombre");
            String nuevoNombre = entrada.nextLine();
            nombres.add(nuevoNombre);
          
        }
        System.out.println(nombres);
    }
    
}
