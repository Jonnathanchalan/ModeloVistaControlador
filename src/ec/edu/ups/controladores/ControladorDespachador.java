/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Despachador;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author jonnathan
 */
public class ControladorDespachador {
     private Map<Integer, Despachador> lista;
    private int codigo;

    public ControladorDespachador() {
        lista = new TreeMap<>();
        codigo = 0;
    }
    
    public void create(Despachador objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
    }
    
    public Despachador read(int codigo){
        if(lista.get(codigo) != null){
            return lista.get(codigo);
        }
        return null;
    }
    
    public void update(Despachador objeto){
        lista.put(objeto.getCodigo(), objeto);
    }
    
    public void delete(int codigo){
        lista.remove(codigo);
    }
    
    public void imprimir(){
        System.out.println(lista.entrySet());
    }
    
}
