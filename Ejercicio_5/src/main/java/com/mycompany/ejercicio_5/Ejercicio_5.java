package com.mycompany.ejercicio_5;
import java.util.*;
import java.time.LocalDate;

public class Ejercicio_5 {

    public static void main(String[] args) {
        /*
        Ejercicio 5
        Persona persona = new Persona();
        Persona pers = new Persona("Mateo", "._.", "3425370985", 1, 8, 2004, true);
        System.out.println("Mi edad es: " + pers.obtenerEdad(1, 9, 2023));
        System.out.println(pers.datosString());
        */
        //Ejer 6
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        if((cadena.charAt(0)) < 'A'){
            System.out.println("La letra es un numero");
        }else{
            System.out.println("Es una letra");
        }
        
    }
}
