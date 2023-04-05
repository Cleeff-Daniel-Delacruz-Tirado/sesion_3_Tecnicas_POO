/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author User
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
    /**public static void main(String[] args) {
       Persona persona = new Persona();
       Persona juanpersona = new Persona("juan",25);
       
       imprimir(persona.getTextoImprimir());
       imprimir(juanpersona.getTextoImprimir());
    }
    */
    public static void main(String[] args) {
      Empleado empleado = new Empleado("Manuel",20,"Finanzas");
      
      Empleado empleadoCopia = Empleado.copiaEmpleado(empleado);
     empleadoCopia.setDepartamento("ventas");
       
       imprimir(empleado.getTextoImprimir());
       imprimir(empleadoCopia.getTextoImprimir());
    }
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    
    public static String ConvertirATexto(int entero){
        return String.valueOf(entero);
    }
}
