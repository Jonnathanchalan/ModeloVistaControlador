/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clasesPrueba;
import ec.edu.ups.clases.Cajero;
import ec.edu.ups.clases.Mayorista;
import ec.edu.ups.clases.Persona;
import java.util.SortedSet;
import java.util.TreeSet;
        
/**
 *
 * @author jonnathan
 */
public class Prueba {
    public static void main (String[]args){
       
        
        /*Date date = new Date();
        Mayorista mayorista1 = new Mayorista();
        mayorista1.setNombre("Jaime");
        mayorista1.setCodigo(5);
        Mayorista mayorista2 = new Mayorista();
        mayorista2.setCodigo(6);
        mayorista2.setNombre("Jonnathan");
        Cajero cajero = new Cajero();
        
        if(mayorista1.equals(cajero)){
            System.out.println("iguales");
        }else{
            System.out.println("no iguales");
        }
        
        Set<Mayorista> lista = new HashSet<>();
        lista.add(mayorista1);
        lista.add(mayorista2);
        
        for(Mayorista may : lista){
            System.out.println("Mayorista: " + may);
        }
        
        mayorista2.setNombre("Jonnathan");
        mayorista2.setCodigo(18);
        
        if(lista.contains(mayorista2)){
            System.out.println("Si existe");
        }else{
            System.out.println("No existe");
        }
        
        System.out.println("Ja".compareTo("Jo"));
        
        SortedSet <Cajero> listaOrdenada = new TreeSet<>();
        Cajero cajero1 = new Cajero();
        Cajero cajero2 = new Cajero();
        
        Cajero1.setNombre("Carlos");
        Cajero2.setNombre("Jeovanny");
        
        listaOrdenada.add(Cajero1);
        listaOrdenada.add(Cajero2);
        
        for (Cajero caj : listaOrdenada) {
            System.out.println(caj.getNombre());
        }*/
        
        Mayorista may1 = new Mayorista();
        may1.setCodigo(3);
        may1.setNombre("Jonnathan");
        Mayorista may2 = new Mayorista();
        may2.setCodigo(8);
        may2.setNombre("Carlos");
        Mayorista may3 = new Mayorista();
        may3.setCodigo(2);
        may3.setNombre("Jovany");
        
        /*Lactante lac = new Lactante();
        
        Set<Profesional> lista = new HashSet<>();
        lista.add(prof2);
        lista.add(prof1);
        
        for (Profesional profesional : lista) {
            System.out.println(profesional.getNombre());
        }*/
        
        System.out.println("");
        SortedSet<Mayorista> listaOrdenada = new TreeSet<>();
        listaOrdenada.add(may1);
        listaOrdenada.add(may2);
        listaOrdenada.add(may3);
        
        for (Mayorista mayorista : listaOrdenada) {
            System.out.println(mayorista.getNombre());
        }
        
    }
    
        
    }
    
    

