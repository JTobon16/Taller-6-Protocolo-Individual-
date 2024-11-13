/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6;

/**
 *
 * @author altoc
 */
public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double salario, String departamento){
        super(nombre,salario);
        this.departamento=departamento;
    }   
        
    public void mostrarInfo(){
        mostrarDetalles();
        System.out.println("El departamento al cual pertenece es: "+departamento);
        
    }
    
}
