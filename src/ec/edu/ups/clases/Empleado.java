/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;



/**
 * @version 2.1
 * @since 2019
 * Clase "padre" que hereda a las clases Empleado y Cliente, y a su vez hereda los
 * atributos de la clase Persona, ademas determina las acciones de un Cajero
 * @author jonnathan
 */

    
    public abstract class Empleado extends Persona {

    
    private String cargo;
    private String departamento;
    private double salario;
    

    public Empleado() {
    }
    
    
     public Empleado(String cargo, String departamento, double salario) {
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
    }

    public Empleado(String cargo, String departamento, double salario, int codigo, String cedula) {
        super(codigo, cedula);
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
    }

    
    
     public String cargo() {
        return cargo;
    }

    public void setcargo(String cargo) {
        this.cargo = cargo;
    }

    public void departamento(String departamento) {
        this.departamento = departamento;
    }

    public void setdepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double salario(double salario) {
        return salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    
    
    
     public String sec() {
        return "La seccion " + super.getNombre() + "ventas.";
    }

    public String sec1() {
        return "La seccion " + super.getNombre() + "operativo.";
    }

    public String sec2() {
        return "La seccion " + super.getNombre() + "administracion";
    }
     
     @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + ", departamento=" + departamento + ", salario=" + salario + '}';
    } 
    

    

}
    

