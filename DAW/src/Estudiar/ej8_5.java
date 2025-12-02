package Estudiar;

import java.util.Scanner;

public class ej8_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige el numero mas pequeño");
		float minNum = sc.nextFloat();
		System.out.println("Elige el numero mas grande");
		float maxNum = sc.nextFloat();
		System.out.println("Elige el numero dentro del rango");
		float num = sc.nextFloat();
		
		while(num < minNum|| num>maxNum) {
			System.out.println("Fuera del rango");
			num = sc.nextFloat();
			
			
			
			
			
				}
		if (num >= minNum && num<= maxNum)
			System.out.println("Dentro del rango");
		sc.close();
}
}
