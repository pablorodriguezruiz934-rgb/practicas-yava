package tarea3;

import java.util.Scanner;

public class actividad3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número n: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];   
      
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        double sumaPos = 0, sumaNeg = 0;
        int cantPos = 0, cantNeg = 0, ceros = 0;

        
        for (int num : numeros) {
            if (num > 0) {
                sumaPos += num;
                cantPos++;
            } else if (num < 0) {
                sumaNeg += num;
                cantNeg++;
            } else {
                ceros++;
            }
        }

        
        System.out.println("\n--- RESULTADOS ---");
        if (cantPos > 0)
            System.out.println("Media de positivos: " + (sumaPos / cantPos));
        else
            System.out.println("No se introdujeron positivos.");

        if (cantNeg > 0)
            System.out.println("Media de negativos: " + (sumaNeg / cantNeg));
        else
            System.out.println("No se introdujeron negativos.");

        System.out.println("Cantidad de ceros: " + ceros);

        sc.close();
    }
}

