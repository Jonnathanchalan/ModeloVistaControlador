/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Minorista;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jonnathan
 */
public class ControladorMinorista {
    private Set<Minorista> lista;
    private int codigo;

    public ControladorMinorista() {
        lista = new HashSet<>();
        codigo = 0;
    }
    
    public void create(Minorista objeto){
        codigo++;
        objeto.setCodigo(this.codigo);
        lista.add(objeto);
    }
    
    public Minorista read(int codigo){
        for(Minorista minorista : lista){
            if(codigo == minorista.getCodigo()){
                return minorista;
            }
        }
        return null;
    }
    
    public void update(Minorista objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        
        for(Minorista objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
        
    }
    
    public void imprimir(){
        for (Minorista minorista : lista) {
            System.out.println(minorista.getNombre());
        }
    }
    
}
