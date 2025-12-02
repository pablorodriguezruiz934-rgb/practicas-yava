package Estudiar;
import java.util.Scanner;
public class ej8_13 {
public static void main(String[] args) {
	int n1;
	int condicionados=0;
	int suspensos=0;
	int aprobados=0;
	Scanner sc = new Scanner(System.in);
		for(int i=0;i<6;i++) {
		 n1 = sc.nextInt();
		if(n1<5) {
			if(n1==4)
			condicionados++;
			else
				suspensos++;
			{
				
			}
		}
		if(n1>=5)
		aprobados++;
		}
		System.out.println("alumnos aprobados "+aprobados);
		System.out.println("alumnos suspensos "+suspensos);
		System.out.println("alumnos condicionados "+condicionados);
}
}
