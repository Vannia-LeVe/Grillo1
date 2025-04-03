/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mangoo.entidades;

/**
 *
 * @author alumnog
 */
public class Televisión  extends DispositivoElectronico{
    private int pulgadas;
    private int volumenActual;
    
    
    public Televisión(String marca, String modelo,String color,int pulgadas, int volumenActual){ 
        super(marca,modelo,color);
        this.pulgadas=pulgadas;
        this.volumenActual=volumenActual;
    }
    
    public String cambiarVolumen(int cantidad){
        if (cantidad>0 && cantidad <=100){
            this.volumenActual = cantidad;
            return "Se cambio el volumen a " + cantidad;
        }else {
            return "El valor debe ser mayor o igual a 0";
                }
            }
    public String preder(){
        return "la tv esta cargando";
    }
    @Override
    public double calcularDepreciación(double precio){
        return precio* 0.05;
        
    }
}

