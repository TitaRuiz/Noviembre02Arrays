package com.corenetworks.presentacion;

import com.corenetworks.modelo.Proyecto;

import java.util.Scanner;

public class ProbarProyecto {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto(1,"Hacienda",1000,50);
        System.out.println("Importe sin descuento -> "+ p1.calcularImporte());
        System.out.println("Importe con descuent del 10% -> "+ p1.calcularImporte(0.10));

        //Definir Scanner
        Scanner teclado = new Scanner(System.in);
        double descuentoPresentacion;
        System.out.println("Escriba el descuento (debe ser decimal entre 0-1)");
        descuentoPresentacion = teclado.nextDouble();

        System.out.println("Importe con descuento -> " + p1.calcularImporte(descuentoPresentacion));

        System.out.println("Escriba el descuento (debe ser decimal entre 0-1 ");
        System.out.println("Importe con descuento -> " + p1.calcularImporte(teclado.nextDouble()));


    }
}
