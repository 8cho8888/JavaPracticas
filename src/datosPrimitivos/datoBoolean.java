/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosPrimitivos;

/**
 *
 * @author 8cho8888
 */
public class datoBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b;
        b=false;
        System.out.println("b es: "+b);
        b=true;
        System.out.println("b es: "+b);
        //Un valor booleano puede contralar la sentencia if
        if(b) System.out.println("Esto si ejecutará.");
        b=false;
        if(b) System.out.println("Esto no se ejecutará.");
        //El resultado de un operador relacional es un valor booleano
        System.out.printf("10 > 9 es "+ (10 > 9));
    }
    
}
