/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Mayorista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonnathan
 */
public class ControladorMayorista {
    private List <Mayorista> lista;
    private int codigo;

    public ControladorMayorista() {
        lista = new ArrayList<>();
        codigo = 1;
    }
    
    public void create(Mayorista objeto){
        objeto.setCodigo(codigo);
        codigo++;
        lista.add(objeto);
    }
    
    public Mayorista read(int codigo){
        for(Mayorista mayorista : lista){
            if(mayorista.getCodigo() == codigo){
                return mayorista;
            }
        }
        return null;
    }
    
    public void update(Mayorista objeto){
        for(int i = 0; i < lista.size(); i++){
            Mayorista elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(int codigo){
        for(int i = 0; i < lista.size(); i++){
            Mayorista elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
}
