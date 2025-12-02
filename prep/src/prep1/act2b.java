package prep1;
import java.util.Scanner;
public class act2b {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        String[] palabras = new String[8];

      
        String[] coloresConocidos = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};

        // Arrays auxiliares
        String[] colores = new String[8];
        String[] noColores = new String[8];
        int indiceColores = 0;
        int indiceNoColores = 0;

      
        System.out.println("Introduce 8 palabras:");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = sc.nextLine().toLowerCase(); // paso a minúsculas para comparar
        }

      
        for (String palabra : palabras) {
            boolean esColor = false;
            for (String color : coloresConocidos) {
                if (palabra.equals(color)) {
                    esColor = true;
                    break;
                }
            }
            if (esColor) {
                colores[indiceColores++] = palabra;
            } else {
                noColores[indiceNoColores++] = palabra;
            }
        }

      
        System.out.println("\nResultado:");
        for (int i = 0; i < indiceColores; i++) {
            System.out.print(colores[i] + " ");
        }
        for (int i = 0; i < indiceNoColores; i++) {
            System.out.print("no color "+noColores[i] + " ");
        }

        sc.close();
    }
}

