package org.example;

public  abstract class Hincha {

    private String cedula;
    private String correo;
    private String nombre;

    private final Double iva = 0.19;


    //CONSTRUCTOREES
    public Hincha() {
    }

    public Hincha(String cedula, String correo, String nombre) {
        this.cedula = cedula;
        this.correo = correo;
        this.nombre = nombre;
    }

    //GETTERS AND SETTERS


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getIva() {
        return iva;
    }

    //Metodos
    public abstract Double valorNeto(Integer cantidad);

    public abstract Double descuentoTribuna();

    public Double descuentoFecha(Integer dia){
        if(dia==1){
            return 0.05;
        }else if(dia==2){
            return 0.02;
        }else if(dia==3){
            return 0.015;
        }
        return 0.01;
    }

    public Double descuentoIva(Double iva){
        return iva;
    }



}
