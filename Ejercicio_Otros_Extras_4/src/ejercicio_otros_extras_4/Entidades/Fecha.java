/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_otros_extras_4.Entidades;

/**
 *
 * @author droa
 */
public class Fecha {
    // Atributos
    private int dia;
    private int mes;
    private int anio;
    private boolean biciesto;
    
    // Constructores

    public Fecha() {
        this.dia=1;
        this.mes=1;
        this.anio=1900;  
        this.biciesto=false;
    }

    public Fecha(int dia, int mes, int anio) {
        //boolean esBiciesto= false;

        /*if(anio%4==0){  // Paso 1
            if(anio%100==0){ // Paso 2
                if(anio%400==0){// Paso 3
                    esBiciesto=true; // Paso 4
                }else{
                    esBiciesto=false; // Paso 5
                }            
            }else{
                esBiciesto=true;
            }    
        }else{
            esBiciesto=false;
        }*/
        //        F              V             F        (1900)  ambiguedad
        //        F              V             V        (1904)  true      
        //        F              V             V        (2024)  true
        //if(anio%400==0 || (anio%4==0 && anio%100!=0))
        if(anio%400==0 || (anio%4==0 && anio%100!=0))
        {
            switch (mes) {
            case 1,3,5,7,8,10,12 -> {
                if(dia>31){
                    this.dia=31;
                }else{
                    this.dia=dia;
                }
            }
            
            case 4,6,9,11 -> {
                if(dia>30){
                    this.dia=30;
                }else{
                    this.dia=dia;
                }
            }
               
            default -> {
                if(dia>29){
                    this.dia=29;
                }else{
                    this.dia=dia;
                }
            }
            
            }
            this.biciesto=true;
        }else
        {
            switch (mes) {
            case 1,3,5,7,8,10,12 -> {
                if(dia>31){
                    this.dia=31;
                }else{
                    this.dia=dia;
                }
            }
            
            case 4,6,9,11 -> {
                if(dia>30){
                    this.dia=30;
                }else{
                    this.dia=dia;
                }
            }
               
            default -> {
                if(dia>28){
                    this.dia=28;
                }else{
                    this.dia=dia;
                }
            }
        }
            this.biciesto=false;
        }
        
        
        this.mes = mes;
        
        if(anio<=2021 && anio>=1900){
            this.anio = anio;
        }else{
            this.anio = 1900;
        }
    }
    
    // Métodos

    public boolean esBiciesto() {
        return biciesto;
    }

    public void setBiciesto(boolean biciesto) {
        this.biciesto = biciesto;
    }

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    // Método Propio
    
    public void cantDias(){
        int totaldias;
        switch (this.mes) {
            case 1,3,5,7,8,10,12 -> {
                totaldias=31;
            }
            
            case 4,6,9,11 -> {
                totaldias=30;
            }
               
            default -> {
                if(this.biciesto){
                    totaldias=29;
                }else{
                    totaldias=28;
                }
            }
            
            }
        System.out.println("Este mes tiene: "+totaldias);
    }
    public void diaAnterior(){
        int diaAnterior=0;
        int mesAnterior=this.mes;
        int anioAnterior=this.anio;
        
        if(this.mes != 2){
            switch (this.mes) {
            
                case 5, 7, 8, 10, 12 -> {
                    if (this.dia == 1) {
                        diaAnterior = 30;
                        mesAnterior = this.mes - 1;
                    } else {
                        diaAnterior = this.dia - 1;
                    }
                }
                case 4, 6, 9, 11 -> {
                    if (this.dia == 1) {
                        diaAnterior = 31;
                        mesAnterior = this.mes - 1;
                    } else {
                        diaAnterior = this.dia - 1;
                    }
                }
                case 3 -> {
                    if (this.dia == 1) {
                        if (biciesto) {
                            diaAnterior = 29;
                        } else {
                            diaAnterior = 28;
                        }
                        mesAnterior = this.mes - 1;
                    } else {
                        diaAnterior = this.dia - 1;
                    }
                }
                case 1 -> {
                    if (this.dia == 1) {
                        diaAnterior = 31;
                        mesAnterior = 12;
                    } else {
                        diaAnterior = this.dia - 1;
                    }
                }
         
            }
        }
        if(this.mes==1 && this.dia==1){
           
            mesAnterior = 12;
            anioAnterior = this.anio - 1;

        } else {
            mesAnterior = 12;
        
        }
        System.out.println("La fecha del Día Anterior es: "+diaAnterior+"/"+mesAnterior+"/"+anioAnterior);
    }
    
    public void diaPosterior(){
        
        int diaPosterior=0;
        int mesPosterior=0;
        int anioPosterior=0;
        
        //if(this.mes != 2){
            switch (this.mes) {
            
                case 1, 3, 5, 7, 8, 10 -> {
                    if (this.dia == 31) {
                        diaPosterior = 1;
                        mesPosterior = this.mes + 1;
                    } else {
                        diaPosterior = this.dia + 1;
                    }
                }
                case 4, 6, 9, 11 -> {
                    if (this.dia == 30) {
                        diaPosterior = 1;
                        mesPosterior = this.mes + 1;
                    } else {
                        diaPosterior = this.dia + 1;
                    }
                }
                case 2 -> {
                    if (biciesto) {
                        if (this.dia==29) {
                            diaPosterior = 1;
                            mesPosterior = this.mes + 1 ;
                        } else {
                            diaPosterior = this.dia + 1 ;
                            mesPosterior = this.mes;
                        }
                        
                    } else {
                        if (this.dia==28) {
                            diaPosterior = 1;
                            mesPosterior = this.mes + 1 ;
                        } else {
                            diaPosterior = this.dia + 1 ;
                            mesPosterior = this.mes;
                        }
                    }
                }
                case 12 -> {
                    if (this.dia == 31) {
                        diaPosterior = 1;
                        mesPosterior = 1;
                    } else {
                        diaPosterior = this.dia + 1;
                    }
                }
         
            }
        
        if(this.mes==12 && this.dia==31){
           
            mesPosterior = 1;
            anioPosterior = this.anio + 1;

        } else {
            mesPosterior = 1;
        
        }
        System.out.println("La fecha del Día Posterior es: "+diaPosterior+"/"+mesPosterior+"/"+anioPosterior);
    }
    

}
