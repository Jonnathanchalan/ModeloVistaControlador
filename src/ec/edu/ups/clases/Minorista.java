/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.Interfaces.Demanda;

/**
 * @since 2019
 * @version 2.1
 * Clase "Hija" que hereda los atributos de la clase Cliente, ademas determina las
 * acciones de un cliente Minorista
 * @author jonnathan
 */

    
    public final class Minorista extends Cliente implements Demanda {

    private double pagoPorServicio;
    private double cambioRecibido;
    private String calificacionPorServicio;
    private String recomendadoPor;

    public Minorista() {
    }

    public Minorista(double pagoPorServicio, double cambioRecibido,
            String calificacionPorServicio, String recomendadoPor) {
        this.pagoPorServicio = pagoPorServicio;
        this.cambioRecibido = cambioRecibido;
        this.calificacionPorServicio = calificacionPorServicio;
        this.recomendadoPor = recomendadoPor;
    }

    public Minorista(double pagoPorServicio, double cambioRecibido,
            String calificacionPorServicio, String recomendadoPor,
            String tipoPago, double descuento, String tipoSolicitud,
            int cantidadSolicitudes, int codigo, String nombre, String cedula,
            String telefono) {
        
        
        this.pagoPorServicio = pagoPorServicio;
        this.cambioRecibido = cambioRecibido;
        this.calificacionPorServicio = calificacionPorServicio;
        this.recomendadoPor = recomendadoPor;
    }

    public Minorista(String nombre, int cantidad, int dni, int ruc, boolean valorc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Minorista(String nombre, boolean cantidad, int dni, int ruc, boolean valorc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getPagoPorServicio() {
        return pagoPorServicio;
    }

    public void setPagoPorServicio(double pagoPorServicio) {
        this.pagoPorServicio = pagoPorServicio;
    }

    public double getCambioRecibido() {
        return cambioRecibido;
    }

    public void setCambioRecibido(double cambioRecibido) {
        this.cambioRecibido = cambioRecibido;
    }

    public String getCalificacionPorServicio() {
        return calificacionPorServicio;
    }

    public void setCalificacionPorServicio(String calificacionPorServicio) {
        this.calificacionPorServicio = calificacionPorServicio;
    }

    public String getRecomendadoPor() {
        return recomendadoPor;
    }

    public void setRecomendadoPor(String recomendadoPor) {
        this.recomendadoPor = recomendadoPor;
    }

    public void compararPrecios() {
        System.out.println("Compara precios con otras empresas que haya "
                + "visitado antes");
    }

    public void pedirDescuento() {
        System.out.println("Pide descuento de acuerdo a su forma de pago");
    }

    public void analizarMarcas() {
        System.out.println("Compara marcas de productos");
    }

   

    public void pedirFactura() {
        System.out.println("Pide factura física como respaldo");
    }

    public void GuiarseParaLlegar() {
        System.out.println("Mediante una aplicación GPS");
    }

    @Override
    public String importar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String exportar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     /**
     * Método toString que devuelve una cadena de texto, imprimiendo todos los
     * atributos solicitados
     *
     * @return (String) la cadena de texto a imprimir
     */
     @Override
    public String toString() {
        return "ClienteOcasional{" + "pagoPorServicio=" + pagoPorServicio
                + ", cambioRecibido=" + cambioRecibido
                + ", calificacionPorServicio=" + calificacionPorServicio
                + ", recomendadoPor=" + recomendadoPor + '}';
    }

}
    

