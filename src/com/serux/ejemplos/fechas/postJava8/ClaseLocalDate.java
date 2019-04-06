package com.serux.ejemplos.fechas.postJava8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ClaseLocalDate {
    public static void main(String[] args) {


        //***** A date without a time-zone in the ISO-8601 calendar system, such as 2007-12-03. */

        /* Fecha actual del sistema */
        LocalDate fechaActual = LocalDate.now();

        /* Fecha definida */
        LocalDate fechaDefinida = LocalDate.of(2019,4,6);

        /* Fecha definida en String */
        LocalDate fechaDefinidaString = LocalDate.parse("2019-04-03");

        /* Suma dias a una fecha */
        LocalDate masDias = fechaActual.plusDays(80);

        /* Suma meses a una fecha */
        LocalDate masMeses = fechaActual.plusMonths(15);

        /* Suma años a una fecha */
        LocalDate masAnyos = fechaActual.plusYears(5);

        /* Suma un periodo a una fecha */
        Period periodoTiempo = Period.of(1,3,5);
        LocalDate fechaMasPeriodo = fechaActual.plus(periodoTiempo);


        /* Obtener el periodo de tiempo entre dos fechas */
        Period periodoDiferencia = fechaActual.until(fechaActual.plusMonths(2));

        /* Decir si el año de la fecha es bisiesto */
        boolean bisiesto = fechaActual.isLeapYear();

        /* Comparacion de fechas */
        boolean comparacionAnterior = fechaActual.isBefore(masDias);
        boolean comparacionPosterior = fechaActual.isAfter(masDias);
        boolean comparacionIguales = fechaActual.isEqual(masDias);

        /* Cambio de formato de la fecha usando formatos predefinidos */
        String formatoCompleto = fechaActual.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String formatoLargo = fechaActual.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String formatoMediano = fechaActual.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String formatoCorto = fechaActual.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        /* Cambio de formato de la fecha usando formatos propios */
        String formatoPropio = fechaActual.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE 'día' d 'de' MMMM 'del año' yyyy 'de la era' G"));


        System.out.println("Fecha actual " + fechaActual);
        System.out.println("Fecha creada a partir de una definida " + fechaDefinida);
        System.out.println("Fecha creada a partir de una definida en un String " + fechaDefinidaString);
        System.out.println("Fecha actual mas 80 dias " + masDias);
        System.out.println("Fecha actual mas 15 meses " + masMeses);
        System.out.println("Fecha actual mas 5 años " + masAnyos);
        System.out.println("Fecha actual mas periodo de tiempo " + fechaMasPeriodo);
        System.out.println("El año es bisiesto " + bisiesto);
        System.out.println("Cambio de formato " + formatoCompleto);
        System.out.println("Cambio de formato " + formatoLargo);
        System.out.println("Cambio de formato " + formatoMediano);
        System.out.println("Cambio de formato " + formatoCorto);
        System.out.println("Cambio de formato propio: " + formatoPropio);
        System.out.println("Periodo diferencia al sumar dos meses. En meses: [" + periodoDiferencia.getMonths() + "] " +
                "En días [" + periodoDiferencia.getDays() + "]");
    }
}
