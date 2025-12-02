package tarea3;

import java.util.Random;
import java.util.Scanner;

public class actividad4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.print("Introduce longitud de la clave secreta: ");
        int longitud = sc.nextInt();

        int[] claveSecreta = new int[longitud];  

       
        for (int i = 0; i < longitud; i++) {
            claveSecreta[i] = rand.nextInt(5) + 1;
        }

        System.out.println("Intenta adivinar la clave (" + longitud + " dígitos del 1 al 5)");

        int[] intento = new int[longitud];
        boolean acertado = false;

        while (!acertado) {
            System.out.print("Introduce tu intento: ");
            String entrada = sc.next();

            if (entrada.length() != longitud) {
                System.out.println("La longitud debe ser exactamente " + longitud + " dígitos.\n");
                continue;
            }

            
            for (int i = 0; i < longitud; i++) {
                intento[i] = Character.getNumericValue(entrada.charAt(i));
            }

            
            acertado = true;
            for (int i = 0; i < longitud; i++) {
                if (intento[i] < claveSecreta[i]) {
                    System.out.println(intento[i] + " es menor");
                    acertado = false;
                } else if (intento[i] > claveSecreta[i]) {
                    System.out.println(intento[i] + " es mayor");
                    acertado = false;
                } else {
                    System.out.println(intento[i] + " es igual");
                }
            }

            System.out.println();
        }

        System.out.println("¡Enhorabuena! Has acertado la clave secreta.");

        sc.close();
    }
}

