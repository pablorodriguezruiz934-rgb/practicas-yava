package Estudiar;

import java.util.Scanner;

public class we {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce el número:");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            // Imprimir guiones bajos para centrar
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("_");
	            }
	            // Imprimir asteriscos en forma de pirámide
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
}
