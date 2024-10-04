package presentacion;

import entidades.Persona;
import entidades.Producto;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Persona p1 = new Persona("17815251-3","domingo",1000,false,true); //constructor por defecto o constructor sin parametros
        Producto papasLays = new Producto("Papas Lays 125 grs","papas fritas 100% originales elaboradas en no se donde",50,10);

        Persona p2;

        Persona p3 = new Persona("123123123","Pepito",100000000,true,true);

        Producto LataPepsi = new Producto("Pepsi Zero","bebida fantasia 350 cc",50,1);

        Producto otroProducto = new Producto();

        otroProducto.setStock(10);

        papasLays.setPrecio(100);

        p1.comprar(papasLays);

        System.out.println("Favor ingrese nombre de cliente");
        String nombreCliente = Leer.dato();

        System.out.println("Favor ingrese DNI de cliente");
        String DNICliente = Leer.dato();

        System.out.println("Favor ingrese saldo en efectivo del cliente");
        int saldoCliente = Leer.datoInt();

        System.out.println("¿Tiene Hambre?");
        boolean tieneHambre = Leer.datoBoolean();

        System.out.println("¿Tiene sueño?");
        boolean tieneSueno = Leer.datoBoolean();

        p2 = new Persona(DNICliente, nombreCliente,saldoCliente,tieneSueno,tieneHambre);

        System.out.println("Se registra el cliente: "+p2.getNombre() + "Satisfactoriamente!!");

    }
}
