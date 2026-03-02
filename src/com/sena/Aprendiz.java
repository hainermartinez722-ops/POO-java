package com.sena;

public class Aprendiz {

    //atributos
    private String nombre;
    private String documento;
    private String correo;
    private int edad;

    //constructor vacio
    public Aprendiz() {
    }

    //constructor con parametros
    public Aprendiz(String nombre, String documento, String correo, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        setCorreo(correo);
        setEdad(edad);
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setCorreo(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("Correo invalido");
        }
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 150) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("Edad invalida");
        }
    }

    //metodo presentarse
    public String presentarse() {
        return "Hola, mi nombre es " + nombre + ", mi documento es " + documento + ", mi correo es " + correo + " y tengo " + edad + " anos.";
    }
}