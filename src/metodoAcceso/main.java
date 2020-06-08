/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoAcceso;

import java.util.Scanner;

/**
 *
 * @author 8cho8888
 */
public class main {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AccesoPrivado inst1 = new AccesoPrivado();
        AccesoPublico inst2 = new AccesoPublico();
        System.out.println("Asigna un numero inicial");
        int valor = entrada.nextInt();
        inst1.setEntero(valor);
        System.out.println("El valor privado es "+inst1.getEntero());//Como el valor es privado lo mandamos llamar con el metodo get
        System.out.println("El valor publico es "+inst2.edad);//Al ser publico lo llamamos con la instancia.atributo
        System.out.println("El valor estatico es "+AccesoStatico.numero);//Al ser el atributo estatico no se necesita instanciar la clase solo introduciendo el nombre de la clase.atributo
        System.out.println("El resultado de multiplicar es "+AccesoStatico.multiplicar(4, 5));//Aqui asignamos valor al metodo estatico  introduciendo el nombre de la clase.metodo
    }
    
}
