package Estudiar;

import java.util.Scanner;

public class dd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introducir notas ");
double nota1=sc.nextDouble();
double nota2=sc.nextDouble();
double nota3=sc.nextDouble();
double notamedia=(double)(nota1+nota2+nota3)/3;
if (nota1 > 10 || nota2 > 10 || nota3 > 10)
	System.out.println("Las notas deben ser sobre 10 ");
else
System.out.println("Nota media es = "+ notamedia);

}
}