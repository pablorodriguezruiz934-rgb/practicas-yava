package Tarea1;

import java.util.Scanner;

public class act3 {
public static void cilindro(int op,int radio,int altura) {
	Scanner sc =new Scanner(System.in);
	double PI = 3.141592653;
	System.out.println("1 = area");
	System.out.println("2 = volumen");
	String l = sc.nextLine();
	switch (l) {
	case "1":
		double area = 2* PI *radio *(radio+altura);
		System.out.println("Area del cilindro: "+area);
		break;
	case "2":
		double volumen = PI *radio *radio*altura;
		System.out.println("volumen del cilindro: "+volumen);
		break;
	default:
		System.out.println("Accion no valida");
	}
	sc.close();
}
public static void main(String[] args) {
	cilindro(1, 3, 5);
}

}
