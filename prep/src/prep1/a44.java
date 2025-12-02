package prep1;

import java.util.Scanner;

public class a44 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // El jugador indica la longitud de la clave secreta
        System.out.print("Introduce la longitud de la clave: ");
        int ng = sc.nextInt();

        // Generamos la clave secreta
        int[] dg = new int[ng];
        for (int i = 0; i < dg.length; i++) {
            dg[i] = (int) ((Math.random() * 5) + 1);
            // No mostrar la clave secreta al jugador
        }

        boolean sre = false;

        // Bucle de intentos
        while (!sre) {
            int aciertos = 0;
            int[] inte = new int[ng];

            System.out.println("Introduce tu combinación de " + ng + " dígitos:");
            for (int j = 0; j < ng; j++) {
                inte[j] = sc.nextInt();
            }

            // Comparación dígito a dígito
            for (int j = 0; j < ng; j++) {
                if (inte[j] < dg[j]) {
                    System.out.println("Posición " + (j + 1) + ": el número secreto es mayor");
                } else if (inte[j] > dg[j]) {
                    System.out.println("Posición " + (j + 1) + ": el número secreto es menor");
                } else {
                    System.out.println("Posición " + (j + 1) + ": ¡Bien hecho!");
                    aciertos++;
                }
            }

            // Condición de victoria
            if (aciertos == ng) {
                System.out.println("¡ACERTASTE TODOSSSSS!");
                sre = true;
            }
        }

        sc.close();
}
}
