package tarea3;

import java.util.Scanner;

public class actividad1b {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 501);
        }
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        int opcion = sc.nextInt();
        sc.close();

        int destacado = numeros[0];
        if (opcion == 1) {
            for (int n : numeros) {
                if (n < destacado) destacado = n;
            }
        }
        else if (opcion == 2) {
            for (int n : numeros) {
                if (n > destacado) destacado = n;
            }
        } else {
            System.out.println("Opción no válida.");
            return;
        }
        System.out.println();
        for (int n : numeros) {
            if (n == destacado) {
                System.out.print("**" + n + "** ");
            } else {
                System.out.print(n + " ");
            }
        }
    }
}
