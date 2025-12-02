package Estudiar;
import java.util.Scanner;


public class ej8b_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int a = 4, b = 2, c = 6, d = 8;
	 int intentos = 4;
	 boolean abierta =false;
	
	
		while(intentos>0 && !abierta) {
			System.out.println("Introduce la clave");
			int i = sc.nextInt();
			int i2 = sc.nextInt();
			int i3 = sc.nextInt();
			int i4 = sc.nextInt();
		
		if(i==a&&i2==b&&i3==c&&i4==d) {
			abierta=true;
			System.out.println("Caja fuerte abierta");
		}
			else {
			intentos--;
			System.out.println("clave no valida");
			
		}
		if (intentos > 0) {
            System.out.println("Te quedan " + intentos + " intento(s).");
        } else {
            System.out.println("Has agotado todos los intentos. La caja fuerte permanece cerrada.");
        }
		}
		sc.close();
		}
			
}

