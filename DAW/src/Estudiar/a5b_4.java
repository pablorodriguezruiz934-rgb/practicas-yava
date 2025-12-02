package Estudiar;

import java.util.Scanner;

public class a5b_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir nombre");
		String nombre=sc.nextLine();
		System.out.println("Introducir edad");
		int edad=sc.nextInt();
		boolean credencialesActivas = sc.nextBoolean();
		System.out.println("¿Tiene credenciales activas? true/false=" +  credencialesActivas);
		sc.nextLine();
		System.out.print("Introduce tu tipo de usuario (A = Administrador, P = Profesor, E = Estudiante): ");
			char tipoUsuario=sc.nextLine().toUpperCase().charAt(0);
					
			switch(tipoUsuario) {
			case 'A':
				System.out.println("Tipo de usuario: Administrador");
				break;
case 'P':
	System.out.println("Tipo de usuario: Profesor");
				break;
case 'E':
	System.out.println("Tipo de usuario: Estudiante");
	break;
	default:
		 System.out.println("Tipo de usuario no válido");
		}
		
}
}