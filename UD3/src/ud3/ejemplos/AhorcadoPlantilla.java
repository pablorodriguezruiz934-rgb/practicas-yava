package ud3.ejemplos;

import java.util.Scanner;

public class AhorcadoPlantilla {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final String SECRETA="Azofaifa";
	final int MAX_INTENTOS=10;
	boolean acertado=false;
	int intentos=0;
	char letra;
	int cuantasSinAcertar;

	char [] palabra=new char[SECRETA.length()];
	
	for (int i=0;i<SECRETA.length();i++)
		palabra[i]='.';
		
	
	while(!acertado && intentos < MAX_INTENTOS) {

		System.out.println("Palabra : " + String.valueOf(palabra));
		System.out.println("Elige una letra");
		letra = sc.next().charAt(0);

		boolean fallo = true;

		// Comprobación
		for (int i = 0; i < SECRETA.length(); i++) {
			if (Character.toLowerCase(SECRETA.charAt(i)) == Character.toLowerCase(letra)) {
				palabra[i] = SECRETA.charAt(i);
				fallo = false;
			}
		}

		if (fallo) {
			intentos++;
			System.out.println("Fallaste. Intentos usados: " + intentos);
		}

		// Comprobar si ya no quedan puntos
		acertado = !String.valueOf(palabra).contains(".");
	}

	// Resultado final
	if (acertado) {
		System.out.println("Acertaste!! La palabra es: " + SECRETA);
	} else {
		System.out.println("Has perdido. La palabra era: " + SECRETA);
	}
}
}
