/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6;

/**
 *
 * @author altoc
 */
public class Empleado {
    
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
      
    }
    protected void mostrarDetalles(){
        System.out.println("Nombre: "+nombre +",Salario: "+salario);
    
    }    
    
    
}
