/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mangoo.entidades;

/**
 *
 * @author alumnog
 */
public class Computadora extends DispositivoElectronico {
    
    private int memoriaRAM;
    private int espacioDisco;
    
    
    public Computadora(String marca, String modelo,String color, int memoriaRAM, int espacioDisco ){
        //se accede a la clase padre y sus atributos
        super(marca,modelo,color);
        // (en esta clase hay una variable que quiero asignarle) se asigna a los valores de la misma clase
        this.memoriaRAM = memoriaRAM;
        this.espacioDisco= espacioDisco;
    }
   
    //cambiar el espacio disco a traves del metodo 
        public String cambiarEspacio(int espacio){
            
            if(espacio>espacioDisco){
            return "el archivo accede el espacio del disco";
            }else {
             this.espacioDisco= espacio;
             return "el valor debe ser mayor o igual a 100";
            }
        }
        
       
    @Override
       public double calcularDepreciación(double precio){
            return  precio* 0.12;
            
            
    
        }
    }





