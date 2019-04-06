package com.serux.ejemplos.fechas.preJava8;

import java.util.Date;

public class ClaseDate {
    public static void main(String[] args) {

        //**** java.util.date Representa un intante de tiempo.

        /* Fecha actual del sistema*/
        Date fechaActual = new Date();
        Long milisegundosFechaActual = fechaActual.getTime();

        /* Creacion de fecha a partir de milisegundos */
        Date otraFecha = new Date(milisegundosFechaActual + 399902120);

        /* Comprobar si una fecha es posterior a otra*/
        boolean esFechaAnterior = fechaActual.after(otraFecha);

        /* Comprobar si una fecha es anterior a otra*/
        boolean esFechaPosterior = fechaActual.before(otraFecha);

        /* Comparar una fecha a otra */
        int resultado = fechaActual.compareTo(otraFecha);


        System.out.println("La fecha actual es " + fechaActual);
        System.out.println("La otra fecha es " + otraFecha);
        System.out.println("Fecha actual es posterior a la otra fecha " + esFechaAnterior);
        System.out.println("Fecha actual es anterior a la otra fecha " + esFechaPosterior);
        System.out.println("Comparando fechas. [ 0 fechas iguales | >0 Fecha Actual es mayor | <0 Fecha Actual menor] " +
                "=> [" + resultado + "]");


    }
}
