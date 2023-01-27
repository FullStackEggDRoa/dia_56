/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_otros_extras_4.Servicios;

import ejercicio_otros_extras_4.Entidades.Fecha;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class fechaServicios {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Fecha crearFecha(){
        
        int dia_formateado=0;
        int mes_formateado=0;
        int anio_formateado=0;
        
        do{
            System.out.print("Ingrese la Fecha [MM/DD/AAAA]: ");
            String hora = leer.next();
            String[] horaAux = hora.split("\\/", 0);

            

            switch (horaAux.length) {
                case 3 -> {
                        dia_formateado=(int)Integer.parseInt(horaAux[0]);
                        mes_formateado=(int)Integer.parseInt(horaAux[1]);
                        anio_formateado=(int)Integer.parseInt(horaAux[2]);
                        if(diaCorrecto(dia_formateado)){
                            continue;
                        }
                        if(mesCorrecto(mes_formateado)){
                            continue;
                        }
                        if(anioCorrecto(anio_formateado)){
                            continue;
                        }
                        
                    }
                default -> System.out.println("Fecha Ingresada Erradamente. Intente Nuevamente. ");    
            }
        }while(String.valueOf(dia_formateado).length()>2 && String.valueOf(mes_formateado).length()>2 && String.valueOf(anio_formateado).length()!=4);
        
        
        return new Fecha(dia_formateado, mes_formateado, anio_formateado);
    }
    public boolean diaCorrecto(int dia){
        boolean respuesta= true;
        if(dia>31 || dia<0){
            respuesta=false;
        }
        return respuesta;
    }
    public boolean mesCorrecto(int mes){
        boolean respuesta= true;
        if(mes>12 || mes<0){
            respuesta=false;
        }
        return respuesta;
    }
    public boolean anioCorrecto(int anio){
        boolean respuesta= true;
        if(anio>1900 || anio<2400){
            respuesta=false;
        }
        return respuesta;
    }  
}
