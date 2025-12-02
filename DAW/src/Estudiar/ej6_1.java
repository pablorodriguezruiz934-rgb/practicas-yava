package Estudiar;

import java.util.Scanner;

public class ej6_1 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numeroMes = sc.nextInt();
	
	switch (numeroMes){
		case 1:
			System.out.println("enero");
			break;
		case 2:
			System.out.println("febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Mayo");
			break;
		case 5:
			System.out.println("Abril");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
			default:
			System.out.println("No esta dentro del rango de 1 a 12");
	
}
}
}
