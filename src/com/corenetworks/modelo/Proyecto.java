package com.corenetworks.modelo;

public class Proyecto {
    //1. AtributosProyec
    private int idProyecto;
    private String nombreProyecto;
    private double horas;
    private double tarifa;
    //2. Métodos
    public double calcularImporte(){
        return horas * tarifa;
    }

    public double calcularImporte(double descuento){
        return calcularImporte() - (calcularImporte()*descuento);
       // return calcularImporte() * (1-descuento);
    }
    //3. Constructores

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String nombreProyecto, double horas, double tarifa) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    //4. Setters / Getters

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
