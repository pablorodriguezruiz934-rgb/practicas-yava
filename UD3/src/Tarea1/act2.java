package Tarea1;

import java.util.Scanner;

public class act2 {
public static void rango(int a, int b) {
	Scanner sc = new Scanner(System.in);
	 if(a<b) {
		 for(int i = a;i<=b;i++) {
			 System.out.println(i);
		 }
	 
}
	 else {
		 for(int i = b;i<=a;i++) {
			 System.out.println(i);
		 }
	 }
}
public static void main(String[] args) {
	System.out.println("Rango 1");
	rango(6,9);
	
}
}