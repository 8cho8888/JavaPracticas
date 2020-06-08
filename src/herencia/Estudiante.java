/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author 8cho8888
 */
public class Estudiante extends Persona {
    private int idEstudiante;
    private float notaFinal;
    public Estudiante(String nombre, String apellido, int edad, int idEstudiante, float notaFinal){
      super(nombre,apellido,edad);  
    this.idEstudiante = idEstudiante;
    this.notaFinal = notaFinal;
    
    }
    public void mostrarDatos(){
        System.out.println(""+"El nombre de estudiante es: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nIdEstudiante "+idEstudiante+
                "\nNotaFinal:"+notaFinal);
    }
}
