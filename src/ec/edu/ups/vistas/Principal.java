/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vistas;

import ec.edu.ups.clases.Cajero;
import ec.edu.ups.clases.Despachador;
import ec.edu.ups.clases.Mayorista;
import ec.edu.ups.clases.Minorista;
import ec.edu.ups.controladores.ControladorCajero;
import ec.edu.ups.controladores.ControladorDespachador;
import ec.edu.ups.controladores.ControladorMayorista;
import ec.edu.ups.controladores.ControladorMinorista;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jonnathan
 */
public class Principal {
    
    public static void main(String[]arg) throws ParseException{
        Scanner escaner = new Scanner(System.in);
        boolean repetir = true;
        ControladorCajero controladorCajero = new ControladorCajero();
        ControladorDespachador controladorDespachador = new ControladorDespachador();
        ControladorMayorista controladorMayorista = new ControladorMayorista();
        ControladorMinorista controladorMinorista = new ControladorMinorista();

        do {
            System.out.println("Elija una opción:\n1) CRUD Mayorista\n2) CRUD Minorista\n3) CRUD Cajero\n"
                    + "4) CRUD Despachador\n5) SALIR");
            int opcion = escaner.nextInt();

            switch (opcion) {

                case 1:
                    boolean repetirMayorista = true;
                    do {
                        System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Regresar");
                        int opcionMayorista = escaner.nextInt();
                        switch (opcionMayorista) {
                            case 1:
                                System.out.println("Ingrese un nombre:");
                                String nombre = escaner.next();
                                System.out.println("Ingrese una categoria:");
                                String categoria = escaner.next();
                                System.out.println("Ingrese un area del Cliente Mayorista:");
                                String area = escaner.next();
                                System.out.println("Ingrese numeros de creditos: ");
                                int numcre = escaner.nextInt();
                                System.out.println("Ingrese orden de compra:");
                                String orcom = escaner.next();
                                System.out.println("Ingrese el valor total compra");
                                int valor = escaner.nextInt();
                                System.out.println("ingrese fecha de compra:");
                                Date miDate = new SimpleDateFormat("dd/MM/yyyy").parse(escaner.next());
                                System.out.println("fecha de entrega");
                                String fechaRetiroMercaderia=escaner.next();
                                Mayorista objeto = new Mayorista(miDate, numcre, orcom, fechaRetiroMercaderia, orcom, numcre, orcom, numcre, opcion, nombre, area, orcom);
                                controladorCajero.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del Cajero");
                                int codigo2 = escaner.nextInt();
                                System.out.println(controladorCajero.read(codigo2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del Mayorista");
                                codigo2 = escaner.nextInt();
                                if (controladorCajero.read(codigo2) != null) {
                                    System.out.println("Ingrese un nombre:");
                                    nombre = escaner.next();
                                    System.out.println("Ingrese una categoria:");
                                    categoria = escaner.next();
                                    System.out.println("Ingrese un area del Mayorista:");
                                    area = escaner.next();
                                    System.out.println("Ingrese numero de creditos");
                                    numcre = escaner.nextInt();
                                    System.out.println("Valor compra");
                                    valor = escaner.nextInt();
                                    
                                    
                                } else {
                                    System.out.println("El Mayorista no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del Mayorista que va a eliminar");
                                codigo2 = escaner.nextInt();
                                controladorMayorista.delete(codigo2);
                                break;
                            case 5:
                                repetirMayorista = false;
                                break;
                        }
                    } while (repetirMayorista);
                    break;
                case 2:
                    boolean repetirMinorista = true;
                    do {
                        System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Imprimir\n6) Regresar");
                        int opcionMinorista = escaner.nextInt();
                        switch (opcionMinorista) {
                            case 1:
                                System.out.println("Ingrese  nombre cliente:");
                                String nombre = escaner.next();
                               
                                System.out.println("Ingrese cantidad Mercaderia");
                                boolean cantidad = escaner.nextBoolean();
                                System.out.println("Ingrese numero de cedula:");
                                int dni = escaner.nextInt();
                                System.out.println("Numero de Ruc:");
                                int ruc = escaner.nextInt();
                                System.out.println("Ingrese valor compra:");
                                boolean valorc = escaner.nextBoolean();
                               
                                
                                Minorista objeto = new Minorista(nombre,cantidad,dni,ruc,valorc);
                                controladorMinorista.create(objeto);

                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del Minorista");
                                int codigo2 = escaner.nextInt();
                                System.out.println(controladorMinorista.read(codigo2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del Minorista");
                                codigo2 = escaner.nextInt();
                                if (controladorMinorista.read(codigo2) != null) {
                                    System.out.println("Ingrese el nombre:");
                                    nombre = escaner.next();
                                    System.out.println("Ingrese cantidad de mercaderia:");
                                    cantidad = escaner.nextBoolean();
                                    System.out.println("Ingrese numero de cedula:");
                                    dni = escaner.nextInt();
                                    System.out.println("Numero de Ruc:");
                                    ruc = escaner.nextInt();
                                    System.out.println("Ingrese valor compra:");
                                    valorc = escaner.nextBoolean();
                                    
                                   
                                    objeto = new Minorista();
                                    objeto.setCodigo(codigo2);
                                    controladorMinorista.update(objeto);
                                } else {
                                    System.out.println("El Minorista no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del Minorista que va a eliminar");
                                codigo2 = escaner.nextInt();
                                controladorMinorista.delete(codigo2);
                                break;
                            case 5:
                                controladorMinorista.imprimir();
                                break;
                            case 6:
                                repetirMinorista = false;
                                break;
                        }
                    } while (repetirMinorista);

                    break;
                case 3:
                    boolean repetirCajero = true;
                    do {
                        System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Imprimir\n6) Regresar");
                        int opcionCajero = escaner.nextInt();
                        switch (opcionCajero) {
                            case 1:
                                System.out.println("Ingrese el nombre:");
                                String nombre = escaner.next();
                                System.out.println("Ingrese descripcion del producto");
                                boolean producto = escaner.nextBoolean();
                                System.out.println("Ingrese cantidad de Pedido");
                                boolean cpedido = escaner.nextBoolean();
                                System.out.println("Ingrese para comprobar stock");
                                String comprobar = escaner.next();
                                System.out.println("Ingrese valor venta:");
                                boolean valorv = escaner.nextBoolean();
                                
                                Cajero objeto = new Cajero();
                                controladorCajero.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del Cajero");
                                int codigo2 = escaner.nextInt();
                                System.out.println(controladorCajero.read(codigo2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del Cajero");
                                codigo2 = escaner.nextInt();
                                if (controladorCajero.read(codigo2) != null) {
                                    System.out.println("Ingrese un nombre:");
                                    nombre = escaner.next();
                                    System.out.println("Ingrese descripcion del producto");
                                    producto = escaner.nextBoolean();
                                    System.out.println("Ingrese cantidad de Pedido");
                                    cpedido = escaner.nextBoolean();
                                    System.out.println("Ingrese para comprobar stock");
                                    comprobar = escaner.next();
                                    System.out.println("Ingrese valor venta:");
                                    valorv = escaner.nextBoolean();
                                   
                                    objeto = new Cajero();
                                    objeto.setCodigo(codigo2);
                                    controladorCajero.update(objeto);
                                } else {
                                    System.out.println("El Cajero no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del Cajero que va a eliminar");
                                codigo2 = escaner.nextInt();
                                controladorCajero.delete(codigo2);
                                break;
                            case 5:
                                controladorCajero.imprimir();
                                break;
                            case 6:
                                repetirCajero = false;
                                break;
                        }
                    } while (repetirCajero);

                    break;
                case 4:
                    boolean repetirDespachador = true;
                    do {
                        System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Imprimir\n6) Regresar");
                        int opcionDespachador = escaner.nextInt();
                        switch (opcionDespachador) {
                            case 1:
                                System.out.println("Ingrese el nombre :");
                                String nombre = escaner.next();
                                System.out.println("Revisar Productos:");
                                int rev = escaner.nextInt();
                                System.out.println("Revisar Factura");
                                String revf = escaner.next();
                                System.out.println("Alistar productos bodega");
                                String revp =escaner.next();
                                System.out.println("Entregar productos");
                                String entp= escaner.next();
                                
                                Despachador objeto = new Despachador();
                                controladorDespachador.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del Despachador");
                                int codigo2 = escaner.nextInt();
                                System.out.println(controladorDespachador.read(codigo2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del Despachador");
                                codigo2 = escaner.nextInt();
                                if (controladorDespachador.read(codigo2) != null) {
                                    System.out.println("Ingrese un nombre:");
                                    nombre = escaner.next();
                                    System.out.println("Revisar Productos:");
                                    rev = escaner.nextInt();
                                    System.out.println("Revisar Factura");
                                    revf = escaner.next();
                                    System.out.println("Alistar productos bodega");
                                    revp =escaner.next();
                                    System.out.println("Entregar productos");
                                    entp= escaner.next();
                                    
                                    
                                    objeto = new Despachador();
                                    objeto.setCodigo(codigo2);
                                    controladorDespachador.update(objeto);
                                } else {
                                    System.out.println("El Despachador no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del Despachador que va a eliminar");
                                codigo2 = escaner.nextInt();
                                controladorDespachador.delete(codigo2);
                                break;
                            case 5:
                                controladorDespachador.imprimir();
                                break;
                            case 6:
                                repetirDespachador = false;
                                break;
                        }
                    } while (repetirDespachador);

                    break;
                case 5:
                    repetir = false;

            }

        } while (repetir);

    }
}    

