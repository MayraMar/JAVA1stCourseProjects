package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {
        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println( "La hora actual es: " + LocalTime.now() );
        System.out.println( "La fecha y hora actuales son: " + LocalDateTime.now() );
        System.out.println( "El instante actual es: " + Instant.now() );
        System.out.println( "La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now() );
        System.out.println( "Fecha de mi cumpleaños: " + LocalDate.of(1972, Month.MAY, 23) );
        LocalDate hoy = LocalDate.parse("2021-10-29");
        LocalDate octubre29 = LocalDate.parse("29/10/2021", DateTimeFormatter.ofPattern("d/M/yyyy") );
        System.out.println( "hoy: " + hoy);
        System.out.println( "hoy formateado : " + hoy);

        int anioNacimiento=1987;
        System.out.println("Mi edad es: "+ (LocalDateTime.now().getYear()-anioNacimiento));
    }
}
