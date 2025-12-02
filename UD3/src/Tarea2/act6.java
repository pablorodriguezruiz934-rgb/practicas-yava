package Tarea2;
import java.util.Scanner;
public class act6 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Jugador 1, introduce la contraseña: ");
	        String contrasena = sc.nextLine();

	        //Esta funcion es como meter un enter
	        System.out.println("\n\n\n\n\n\n\n\n\n\n");

	        
	        System.out.println("Jugador 2, intenta adivinar la contraseña.");
	        System.out.println("Pista:");
	        System.out.println("- Número de caracteres: " + contrasena.length());
	        System.out.println("- Primera letra: " + contrasena.charAt(0));
	        System.out.println("- Última letra: " + contrasena.charAt(contrasena.length() - 1));

	        System.out.print("\nIntroduce tu intento: ");
	        String intento = sc.nextLine();

	        
	        if (contrasena.equals(intento)) {
	            System.out.println("Acetaste");
	        } else {
	            System.out.println("Fallaste");
	        }

	        sc.close();
	    
	}
}

