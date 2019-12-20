/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Numero;
        System.out.println("Digite un numero: ");
        Numero = Teclado.nextInt();
        if (Numero % 2 == 0) {
            System.out.println("El numero es divisible entre 2: ");
        } else {
            System.out.println("El numero no es divisible entre 2");
        }

    }

}
