package Estudiar;

import java.util.Scanner;

public class ej8_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int nr=(34);
	int n = sc.nextInt();
	int intentos=0;
	while(!(n==nr)){
		System.out.println("Intentalo de nuevo");
		n = sc.nextInt();
		intentos++;
	}
	if(n==nr) {
		System.out.println("ACERTASTEEE "+ n +" intentos= "+intentos);
	sc.close();
	}
}
}
