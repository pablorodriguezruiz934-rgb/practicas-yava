package Estudiar;
import java.util.Scanner;
public class df {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int dia1, dia2, hora1 = -1, hora2 = -1;

	        System.out.println("Introduce el primer día (1-7): ");
	        dia1 = sc.nextInt();

	        switch (dia1) {
	            case 1: System.out.println("Lunes"); break;
	            case 2: System.out.println("Martes"); break;
	            case 3: System.out.println("Miércoles"); break;
	            case 4: System.out.println("Jueves"); break;
	            case 5: System.out.println("Viernes"); break;
	            case 6: System.out.println("Sábado"); break;
	            case 7: System.out.println("Domingo"); break;
	            default:
	                System.out.println("Día inválido.");
	                return;
	        }

	        System.out.println("Introduce la hora (0-23): ");
	        hora1 = sc.nextInt();

	        System.out.println("Introduce el segundo día (1-7, debe ser posterior): ");
	        dia2 = sc.nextInt();

	        if (dia2 <= dia1) {
	            System.out.println("El segundo día debe ser posterior.");
	            return;
	        }

	        switch (dia2) {
	            case 1: System.out.println("Lunes"); break;
	            case 2: System.out.println("Martes"); break;
	            case 3: System.out.println("Miércoles"); break;
	            case 4: System.out.println("Jueves"); break;
	            case 5: System.out.println("Viernes"); break;
	            case 6: System.out.println("Sábado"); break;
	            case 7: System.out.println("Domingo"); break;
	            default:
	                System.out.println("Día inválido.");
	                return;
	        }

	        System.out.println("Introduce la hora (0-23): ");
	        hora2 = sc.nextInt();

	        int horasTotales = (dia2 - dia1) * 24 + (hora2 - hora1);

	        System.out.println("Han pasado " + horasTotales + " horas entre los días " + dia1 + " y " + dia2);
	    
	}
}
