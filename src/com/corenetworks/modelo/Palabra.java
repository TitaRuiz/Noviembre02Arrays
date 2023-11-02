package com.corenetworks.modelo;

public class Palabra {
    private String[] palabras;

    public void actualizaElemento(String contenido, int posicion){
        //Contenido se guarda en array en la posicion
        palabras[posicion]=contenido;
    }

    public Palabra(int elementos) {
        palabras = new String[elementos];
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }
}
