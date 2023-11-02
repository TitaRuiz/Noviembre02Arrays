package com.corenetworks.presentacion;

import com.corenetworks.modelo.Vendedor;

public class ProbarVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(23,1_500,"1234567A","Manolo",30_000,0.01);
        System.out.println("Sueldo ->"+ v1.calcularSueldo());
        System.out.println("Impuesto -> " + v1.calcularImpuesto());
        System.out.println(v1.toString());
    }
}
