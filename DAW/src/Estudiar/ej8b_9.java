package Estudiar;

import java.util.Scanner;

public class ej8b_9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int altura = sc.nextInt();
	int base = (altura/2)+1 ;
	
	for(int i=1;i<altura;i++) {
		System.out.println("*");
	}
		for(int j=1;j<=base;j++) {
			System.out.print("*");
		}
		
	
	System.out.println();

    sc.close();
}
}
