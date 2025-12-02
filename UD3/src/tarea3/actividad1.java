package tarea3;

import java.util.Scanner;

public class actividad1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double [] numeros=new double[5];
	System.out.println("Introduce los numeros: ");
	for(int i = 0;i<numeros.length;i++) {
	 numeros[i]= sc.nextDouble();
	}
	for(int i = numeros.length - 1; i >= 0; i--)  {
		System.out.println(numeros[i]);
		}
}
}
