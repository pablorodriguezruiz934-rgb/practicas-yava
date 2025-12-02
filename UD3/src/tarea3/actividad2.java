package tarea3;

import java.util.Scanner;

public class actividad2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int intro= sc.nextInt();
	int [] numeros= new int[intro];
	for(int i = 0;i<numeros.length;i++) {
	numeros[i] = sc.nextInt();
	}
for(int i =numeros.length-1; i>=0;i--) {
	System.out.println((numeros[i]));
}
}
}