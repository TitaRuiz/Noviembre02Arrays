package com.corenetworks.presentacion;

import java.util.Scanner;

public class ProbarArrays {

    public static void main(String[] args) {
        //1. Definir un array de 5 letras - char
        char[] letras = new char[5];
        char[] vocales = {'a','e','i','o','u'};
        letras[0]= 'a';
        letras[1] = 'e';
        letras[2] = 'i';
        letras[3] = 'o';
        letras[4] = 'u';

        char letra = 'a';

        for(int i = 0 ; i < letras.length; i++){
            System.out.println("Elemento " + i + " -> "+ letras[i]);
        }

        for(char elemento:letras){
            System.out.println(elemento);
        }

        //Definir un array de String de 3 elementos
        //Pedir por consola los tres elementos de la consola
        String[] palabras = new String[3]; //sabemos el número de elementos

        Scanner teclado = new Scanner(System.in);
        //2. Estructura
        for(int i=0 ; i<palabras.length; i++){
            System.out.println(" Escriba la palabra -> ");
            palabras[i]=teclado.nextLine();
        }




    }
}
