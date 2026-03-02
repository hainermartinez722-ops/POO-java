package com.sena;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        //creamos los objetos con el constructor
        Aprendiz aprendiz1 = new Aprendiz("Santiago Herrera", "1023456781", "santiago@correo.com", 19);
        Aprendiz aprendiz2 = new Aprendiz("Valentina Torres", "1023456782", "valentina@correo.com", 21);

        //objeto con constructor vacio
        Aprendiz aprendiz3 = new Aprendiz();
        aprendiz3.setNombre("Camilo Ospina");
        aprendiz3.setDocumento("1023456783");
        aprendiz3.setCorreo("camilo@correo.com");
        aprendiz3.setEdad(23);

        //lista de aprendices
        ArrayList<Aprendiz> aprendices = new ArrayList<>();

        //agregamos a la lista
        aprendices.add(aprendiz1);
        aprendices.add(aprendiz2);
        aprendices.add(aprendiz3);

        //recorremos la lista
        for (Aprendiz aprendiz : aprendices) {
            System.out.println(aprendiz.presentarse());
            System.out.println("Nombre: " + aprendiz.getNombre());
            System.out.println("Documento: " + aprendiz.getDocumento());
            System.out.println("Correo: " + aprendiz.getCorreo());
            System.out.println("Edad: " + aprendiz.getEdad());
            System.out.println("---------------------------");
        }
    }
}
