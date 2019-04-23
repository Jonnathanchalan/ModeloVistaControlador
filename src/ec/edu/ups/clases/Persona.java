/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 * @since 2019
 * @version 2.1 
 * Clase "Abuelo" que hereda a las clases Empleado y Cliente, ademas determina
 * las acciones de una persona
 * @author jonnathan
 */
public class Persona {
    
    private int codigo;
    private String cedula;
    private String nombre;
    private Date fechaContratacion;
    private String email;
    
    public Persona(){
        
    }

    public Persona(int codigo, String cedula) {
        this.codigo = codigo;
        this.cedula = cedula;
    }

    public Persona(int codigo, String cedula, String nombre, Date fechaContratacion, double salario, String email) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", fechaContratacion=" + fechaContratacion + ", email=" + email + '}';
    }
    
    public void codigo(){
        System.out.println("Este codigo imprime el codigo de cada trabajador");
    }
    
    public void cedula(){
        System.out.println("Este codigo imprime el numero de cedula de cada trabajador");
    }
    
    public void nombre(){
        System.out.println("Este codigo imprime el nombre de cada trabajador");
    }
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("mismo objeto");
            return true;
        }
        if (obj == null) {
            System.out.println("vacio");
            return false;
        }
        if (getClass() != obj.getClass()) {
            System.out.println("clases diferentes");
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.codigo != other.codigo) {
            System.out.println("codigos diferentes");
            return false;
        }
        System.out.println("iguales");
        return true;

    }

    //Sorted Set
    public int compareTo(Persona o) {
        return nombre.compareTo(o.nombre);
    }
}
