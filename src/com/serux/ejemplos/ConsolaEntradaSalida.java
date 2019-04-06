package com.serux.ejemplos;

import java.util.Scanner;

public class ConsolaEntradaSalida {
    public static void main(String[] args) {
        String nombre = solicita("nombre");
        System.out.println(nombre);
    }


    private static void informaObligatorio(String nombreCampo) {
        System.out.println("El campo '" + nombreCampo + "' es obligarotorio.");
        System.out.println("Por favor, introduzca su '" + nombreCampo + "'.");
    }

    private static boolean esRespuestaVacia(String respuesta){
        return respuesta.length() == 0;
    }

    private static String solicita(String nombreCampo) {
        System.out.println("Por favor introduzca su " + nombreCampo);
        Scanner escaner = new Scanner(System.in);
        String respuesta = escaner.nextLine();

        if(esRespuestaVacia(respuesta)){
            do{
                informaObligatorio(nombreCampo);
                respuesta = escaner.nextLine();
            }while(respuesta.length() == 0);
        }
        escaner.close();
        return respuesta;
    }
}
