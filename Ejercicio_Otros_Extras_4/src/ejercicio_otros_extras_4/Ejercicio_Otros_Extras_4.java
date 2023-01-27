/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_otros_extras_4;

import ejercicio_otros_extras_4.Entidades.Fecha;
import ejercicio_otros_extras_4.Servicios.fechaServicios;

/**
 *
 * @author droa
 */
public class Ejercicio_Otros_Extras_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fechaServicios fS=new fechaServicios();
        Fecha f1 = fS.crearFecha();
        f1.cantDias();
        f1.diaAnterior();
        f1.diaPosterior();
        if(f1.esBiciesto()){
            System.out.println("El Año es Biciesto.");
        }else{
            System.out.println("El Año NO es Biciesto");
        }
        
        
    }
    
}
