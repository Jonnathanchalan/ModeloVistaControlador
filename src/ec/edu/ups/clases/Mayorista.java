/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;
    

import ec.edu.ups.Interfaces.Demanda;
import java.util.Date;
import java.util.GregorianCalendar;
   
/**
 * @since 2019
 * @version 2.1
 * Clase "Hija" que hereda los atributos de la clase Cliente, ademas determina las
 * acciones de un cliente Mayorista
 * @author jonnathan
 */

    public  final class Mayorista extends Cliente implements Demanda {

    private GregorianCalendar fechaClienteMayorista;
    private int numCreditos;
    private String ordenCompra;
    private GregorianCalendar fechaRetiroMercaderia;

    public Mayorista() {
    }

    public Mayorista(GregorianCalendar fechaClienteFijo, int numCreditos,
            String ordenCompra, GregorianCalendar fechaRetiroMercaderia) {
        this.fechaClienteMayorista = fechaClienteFijo;
        this.numCreditos = numCreditos;
        this.ordenCompra = ordenCompra;
        this.fechaRetiroMercaderia = fechaRetiroMercaderia;
    }

    public Mayorista(GregorianCalendar fechaClienteFijo, int numCreditos,
            String ordenCompra, GregorianCalendar fechaRetiroMercaderia,
            String tipoPago, double descuento, String tipoSolicitud,
            int cantidadSolicitudes, int codigo, String nombre, String cedula,
            String telefono) {
        
        
        
        this.fechaClienteMayorista = fechaClienteFijo;
        this.numCreditos = numCreditos;
        this.ordenCompra = ordenCompra;
        this.fechaRetiroMercaderia = fechaRetiroMercaderia;
    }

    public Mayorista(GregorianCalendar fechaClienteMayorista, int numCreditos, String ordenCompra, GregorianCalendar fechaRetiroMercaderia, String pedido, int cantidad, String proforma, int codigo, String cedula) {
        super(pedido, cantidad, proforma, codigo, cedula);
        this.fechaClienteMayorista = fechaClienteMayorista;
        this.numCreditos = numCreditos;
        this.ordenCompra = ordenCompra;
        this.fechaRetiroMercaderia = fechaRetiroMercaderia;
    }

    public Mayorista(Date miDate, int numcre, String orcom, String fechaRetiroMercaderia, String orcom0, int numcre0, String orcom1, int numcre1, int opcion, String nombre, String area, String orcom2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    public GregorianCalendar getFechaClienteFijo() {
        return fechaClienteMayorista;
    }

    public void setFechaClienteFijo(GregorianCalendar fechaClienteFijo) {
        this.fechaClienteMayorista = fechaClienteFijo;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public String getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(String ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public GregorianCalendar getFechaRetiroMercaderia() {
        return fechaRetiroMercaderia;
    }

    public void setFechaRetiroMercaderia(GregorianCalendar fechaRetiroMercaderia) {
        this.fechaRetiroMercaderia = fechaRetiroMercaderia;
    }

    public void revisarNuevaMercaderia() {
        System.out.println("Pregunta por Cantidad de mercadería");
    }

    public void notificarEventos() {
        System.out.println("Notifica importaciones a la empresa");
    }

    public void pagarFacturas() {
        System.out.println("Paga las facturas para minorizar los créditos");
    }

    

    @Override
    public String importar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String exportar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString() {
        return "ClienteMayorista{" + "fechaClienteMayorista=" + fechaClienteMayorista
                + ", numCreditos=" + numCreditos + ", ordenCompra="
                + ordenCompra + ", fechaRetiroMercaderia="
                + fechaRetiroMercaderia + '}';
    }

}




