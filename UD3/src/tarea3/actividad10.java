package tarea3;

import java.util.Scanner;

public class actividad10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tabla = new int[5];  
        int impares = rellenaPares(tabla);

        System.out.println("\nTabla rellena solo con pares:");
        for (int n : tabla) {
            System.out.print(n + " ");
        }

        System.out.println("\nImpares desechados: " + impares);
    }
    public static int rellenaPares(int[] tabla) {
        Scanner sc = new Scanner(System.in);
        int contadorImpares = 0;
        int i = 0;

        System.out.println("Introduce números (se guardan solo los pares):");

        while (i < tabla.length) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                tabla[i] = num;
                i++;
            } else {
                contadorImpares++;
            }
        }

        return contadorImpares;
    }
}