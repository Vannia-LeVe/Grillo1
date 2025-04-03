/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.ui;

import mx.itson.mangoo.entidades.Computadora;
import mx.itson.mangoo.entidades.Televisión;


/**
 *
 * @author alumnog
 */
public class Main {
    public static void main(String[] args) {
        Televisión tv = new Televisión("Samsumg","XH256", "NEGRO", 55,35);
        Computadora pc = new Computadora("Asus", "Ninja200","blanca",128,1024);
        
            tv.encender(84);
            tv.cambiarVolumen(62);
            
            pc.cambiarEspacio(60);
    }
    
}
