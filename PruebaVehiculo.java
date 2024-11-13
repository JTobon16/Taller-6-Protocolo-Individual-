/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller6;

/**
 *
 * @author altoc
 */
public class PruebaVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Moto moto = new Moto("Deportiva", "Honda", 1000);
        moto.mostrarInfo();
        
       
       Vehiculo vehiculo = new Vehiculo("convertible", "Toyota");
        
        
         System.out.println(vehiculo.tipo);   }
}
