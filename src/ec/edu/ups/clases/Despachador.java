/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.Interfaces.Demanda;

/**
 *  Clase "Hija" que hereda los atributos de la clase Empleado, ademas determina las
 * acciones de un despachador
 * @author jonnathan
 */
public final class Despachador extends Empleado implements Demanda {
    
    private String revisarFactura;
    private int revisarProductos ;
    private String alistarProductos;
    private String entregarProcuctos;

    public Despachador() {
    }

    public Despachador(String revisarFactura, int revisarProductos) {
        this.revisarFactura = revisarFactura;
        this.revisarProductos = revisarProductos;
    }

    public Despachador(String revisarFactura, int revisarProductos, String alistarProductos, String entregarProcuctos) {
        this.revisarFactura = revisarFactura;
        this.revisarProductos = revisarProductos;
        this.alistarProductos = alistarProductos;
        this.entregarProcuctos = entregarProcuctos;
    }

    public String getRevisarFactura() {
        return revisarFactura;
    }

    public void setRevisarFactura(String revisarFactura) {
        this.revisarFactura = revisarFactura;
    }

    public int getRevisarProductos() {
        return revisarProductos;
    }

    public void setRevisarProductos(int revisarProductos) {
        this.revisarProductos = revisarProductos;
    }

    public String getAlistarProductos() {
        return alistarProductos;
    }

    public void setAlistarProductos(String alistarProductos) {
        this.alistarProductos = alistarProductos;
    }

    public String getEntregarProcuctos() {
        return entregarProcuctos;
    }

    public void setEntregarProcuctos(String entregarProcuctos) {
        this.entregarProcuctos = entregarProcuctos;
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
        return "Despachador{" + "revisarFactura=" + revisarFactura + ""
                + ", revisarProductos=" + revisarProductos + ", alistarProductos="
                + alistarProductos + ", entregarProcuctos=" + entregarProcuctos + '}';
    }
    
    
}
