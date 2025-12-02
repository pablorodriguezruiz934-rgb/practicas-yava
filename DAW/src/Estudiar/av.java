package Estudiar;

import java.util.Scanner;

public class av {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: Pedir el mínimo
        System.out.println("Elige el número más pequeño:");
        float minNum = sc.nextFloat();

        // Paso 2: Pedir el máximo
        System.out.println("Elige el número más grande:");
        float maxNum = sc.nextFloat();

        // Paso 3: Pedir el número inicial
        System.out.println("Introduce un número dentro del rango:");
        float num = sc.nextFloat();

        // Paso 4: Repetir mientras el número esté fuera del rango
        while (num < minNum || num > maxNum) {
            System.out.println("Ese número no está dentro del rango. Intenta de nuevo:");
            num = sc.nextFloat(); // ← Aquí se vuelve a pedir el número
        }

        // Paso 5: Confirmar que el número es válido
        System.out.println("¡Perfecto! El número " + num + " está dentro del rango.");

        // Paso 6: Cerrar el Scanner (buena práctica)
        sc.close();
    }
}