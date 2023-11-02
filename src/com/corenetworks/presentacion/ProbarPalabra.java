package com.corenetworks.presentacion;

import com.corenetworks.modelo.Palabra;

import java.util.Scanner;

public class ProbarPalabra {

    public static void main(String[] args) {
        //1. Definir variables
        Scanner teclado = new Scanner(System.in);

        int elementos;

        //Pedir el número de palabras - leer por consola
        System.out.println("Cuantas palabras -> ");
        elementos = teclado.nextInt();
        teclado.nextLine();

        Palabra p1 = new Palabra(elementos);

        //2. Estructuras
        for(int i=0; i<elementos;i++){
       // for(int i=0; i<p1.getPalabras().length;i++){
            System.out.println(" Escriba la palabra -> ");
            p1.actualizaElemento(teclado.nextLine(),i);
           //
        }
        for(String elemento : p1.getPalabras()){
            System.out.println(elemento);
        }
    }
}
