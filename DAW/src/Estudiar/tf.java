package Estudiar;
import java.util.Scanner;
public class tf {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int dia1= sc.nextInt();
	int dia2=dia1-1;
	int hora1=0;
	int hora2=0;
	if(dia1==1) {
		dia2=7;
	}
	switch (dia1) {
	case 1:
		System.out.println("Lunes");
		hora1= sc.nextInt();
		break;
	case 2:
		System.out.println("Martes");
		
		hora1= sc.nextInt();
		break;
	case 3:
		System.out.println("Miercoles");
		hora1= sc.nextInt();
		break;
	case 4:
		System.out.println("Jueves");
		hora1= sc.nextInt();
		break;
	case 5:
		System.out.println("viernes");
		hora1= sc.nextInt();
		break;
	case 6:
		System.out.println("Saabado");
		hora1= sc.nextInt();
		break;
	case 7:
		System.out.println("Domingo");
		hora1= sc.nextInt();
		break;
		default:
			System.out.println("dia entre 1 y 7");
	}

switch (dia2) {
case 1:
	System.out.println("Lunes");
	hora2= sc.nextInt();
	break;
case 2:
	System.out.println("Martes");
	
	hora2= sc.nextInt();
	break;
case 3:
	System.out.println("Miercoles");
	hora2= sc.nextInt();
	break;
case 4:
	System.out.println("Jueves");
	hora2= sc.nextInt();
	break;
case 5:
	System.out.println("viernes");
	hora2= sc.nextInt();
	break;
case 6:
	System.out.println("Saabado");
	hora2= sc.nextInt();
case 7:
	System.out.println("Domingo");
	hora2= sc.nextInt();
	break;
	default:
		System.out.println("dia entre 1 y 7");
		
		
}
for(int i=hora1;i<=hora2;i++) {
	int contadorH=0;
	contadorH++;	
	System.out.println("Han pasado "+contadorH+" horas entre los dias "+dia1+" y "+dia2);
}
}
}
