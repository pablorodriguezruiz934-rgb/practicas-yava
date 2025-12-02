package prep1;

import java.util.Arrays;
import java.util.Scanner;

public class a5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 //Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
	// Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una tercera, de forma que los 12 números sigan ordenados.
	//Fusionar significa copiar en el orden correcto para que los datos resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.
	int [] en= new int [6];
	System.out.println("Introduce 6 digitos: ");
	for(int i=0;i<en.length;i++) {
		en[i]=sc.nextInt();
	}
	Arrays.sort(en);
	System.out.println("Tabla 1:");
	for(int j=0;j<en.length;j++) {
		System.out.print(en[j]);
	}
	int [] en2= new int [6];
	System.out.println("");
	System.out.println("Introduce 6 digitos");
	for(int i=0;i<en2.length;i++) {
		en2[i]=sc.nextInt();
	}
	Arrays.sort(en2);
	System.out.println("Tabla 2:");
	for(int j=0;j<en2.length;j++) {
		System.out.print(en2[j]);
	}
	int[] en12= new int [12];
	int i=0,j=0,k=0;
	while(i<en.length && j<en2.length) {
		if(en[i]<=en2[j]) {
			en12[k++] = en[i++];
		} else {
			en12[k++] = en2[j++];
		}
		
	}
	while(i<en.length) {
		en12[k++] = en[i++];
	}
	while(j<en2.length) {
		en12[k++] = en2[j++];
	}
	System.out.println("");
	System.out.println("Fusion tablas:");
	for(int p =0;p < en12.length;p++) {
		System.out.print(+en12[p]);
	}
	}
}

