package com.serux.ejemplos;

public class Variables {
    public static void main(String[] args) {

        /* ###### Tipos primitivos*/

        /* Numeros enteros */
        byte diminuto = 5; // Its range is -128 and 127
        short chico = 22300; // Its range is -32,768 to 32767
        int grande = 42444212; // Its range is -2,147,483,648 to 2,147,483,647
        long enorme = 23332132132132L; //  Its range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.

        /* Numeros decimales */
        float decimalChico = 123.3213f; // Sufficient for holding 6 to 7 decimal digits
        double decimalGrande = 123.1234532345; // Sufficient for holding 15 decimal digits

        boolean error = false;

        char letra = 'Z';


        // ###### Arrays

        int[] numeros; // Declaración Sin especificación de tamaño

        short[] loteria = new short[5]; // Declaración con especificación de tamaño
        loteria[0] = 100;
        loteria[1] = 200;
        loteria[2] = 300;

        long[] adivina = {213123,234234,324234,42344432}; // Declaración e inicializacion

        // Recorrer arrays foreach
        for(long elemento: adivina){
            System.out.println(elemento);
        }
    }
}

