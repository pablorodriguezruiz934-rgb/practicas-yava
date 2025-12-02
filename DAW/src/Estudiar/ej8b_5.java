package Estudiar;

import java.util.Scanner;

public class ej8b_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Altura:");
	int alt = sc.nextInt();
	System.out.println("caracter");
	String caracter = sc.next();
	
	
	for(int i=1;i<=alt;i++) {
	for(int j=1;j<=alt-i;j++) {
		System.out.print(" ");
	}
	for(int k=1;k<=2*i-1;k++) {
	System.out.print(caracter);
	}
	System.out.println();
}
sc.close();
}
}