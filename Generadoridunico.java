/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generadoridunico;

import java.util.Scanner;

import java.util.Random;

/**
 *
 * @author DAVID
 */
public class Generadoridunico {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        
        System.out.println("Ingrese un Nombre: ");
        var nombre = consola.nextLine();
        
       System.out.println("Ingrese un Apellido: ");
       var apellido = consola.nextLine();
       
       System.out.println("Ingrese Fecha de Nacimiento(con formato YYYY): ");
       var fecha = consola.nextLine();
       
       
       var nombre2 = nombre.trim().toUpperCase().substring(0, 2);
       var apellido2 = apellido.trim().toUpperCase().substring(0, 2);
       var fecha2= fecha.trim().substring(0, 2);
       
       var random = new Random();
       var numeroAleatorio = random.nextInt(9999)+1;
       
       var formatoAleatorio = String.format("%04d", numeroAleatorio);
       
       var idUnico = nombre2 + apellido2 + fecha2 + formatoAleatorio;
       
       System.out.printf("""
                         %nHola %s ,
                          \t Su nuevo numero de identificación es:
                          \t%s
                          \t Felicidades
                          """, nombre, idUnico);
    }
}
