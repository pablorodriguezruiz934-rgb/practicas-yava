package Estudiar;
import java.util.Scanner;
public class ej6_5 {
	public static void main(String[] args) {
		
	
Scanner sc = new Scanner(System.in);
System.out.println("Radio =");

double radio= sc.nextDouble();
double diametro= 2*radio;
double perimetro= 2*3.141592*radio;
double area= 3.141592*radio*radio;
System.out.println("Elige una de las 3 opciones");
System.out.println("1 diametro");
System.out.println("2 Perimetro");
System.out.println("3 Area");
int elegir =sc.nextInt();
switch (elegir){
case 1:
	System.out.println("Diametro = "+diametro);
	break;
case 2:
	System.out.println("Perimetro = "+perimetro);
	break;
case 3:
	System.out.println("Area = "+area);
	break;
	default:
		System.out.println("El numero debe estar entre 1 y 3");
}
sc.close();
}
}
