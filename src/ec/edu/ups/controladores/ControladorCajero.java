/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;


import ec.edu.ups.clases.Cajero;
import ec.edu.ups.clases.Mayorista;
import java.util.SortedSet;
import java.util.TreeSet;


public class ControladorCajero{
    
    private SortedSet <Cajero> lista;
    private int codigo;

    public ControladorCajero() {
        lista = new TreeSet<>();
        codigo = 0;
    }
    
    public void create(Cajero objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    public Cajero read(int codigo){
        for(Cajero cajero : lista){
            if(cajero.getCodigo() == (codigo)){
                return cajero;
            }
        }
        return null;
    }
    
    public void update(Cajero objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for(Cajero objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Cajero cajero : lista) {
            System.out.println(cajero.getNombre());
        }
    }

    public void create(Mayorista objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(Mayorista objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


/**
 *
 * @author jonnathan
 */
/*public class ControladorCajero {
    private List<Cajero>lista;

    public ControladorCajero() {
        lista=new ArrayList<>();
    }
    
    
    public void create(Cajero objeto){
        lista.add(objeto);
    }
    
    public Cajero read(int codigo){
        for (Cajero cajero:lista){
            if(cajero.getCodigo()==codigo){
                return cajero;
            }
        }
        return null;
    }
    
    public void update(Cajero objeto){
        for (int i = 0; i < lista.size(); i++) {
            Cajero elemento=lista.get(i);
            if(elemento.getCodigo()==objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }
            
        }
    }
    
    public void remove(Cajero objeto){
        for (int i = 0; i < lista.size(); i++) {
            Cajero elemento=lista.get(i);
            if(elemento.getCodigo()==objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }
            
        }
    }

    public void create(int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(int codigoDL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
        
    

