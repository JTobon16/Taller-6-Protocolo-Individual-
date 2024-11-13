package Taller6_1_Prueba;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



import Taller6.Vehiculo;
import Taller6.Moto;

public class PruebaVehiculo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Moto moto = new Moto("Deportiva", "Honda", 1000);
        moto.mostrarInfo();
        
       
       Vehiculo vehiculo = new Vehiculo("convertible", "Toyota");
        
        
        //System.out.println(vehiculo.tipo);  // Error: tipo tiene un modificador de acceso protected
    }

}