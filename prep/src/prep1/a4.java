package prep1;

import java.util.Scanner;
public class a4 {
public static void main(String[] args) {
	Scanner sc = new 	Scanner(System.in);
//	Juego: La cámara secreta. El jugador especifica el número de dígitos 
	//de la clave secreta. La aplicación genera de forma aleatoria, una combinación 
	//secreta de n dígitos del 1 al 5 (siendo n la longitud indicada anteriormente por el usuario).
	//El jugador introduce ahora una combinación de prueba.
	//En cada intento se mostrará como pista, para cada dígito, si es
	//	mayor menor o igual que el correspondiente de la combinación secreta.
	boolean sre=false;

	int ng=sc.nextInt();
	int [] dg= new int [ng];
	for(int i=0;i<dg.length;i++) {
	 dg[i] = (int) ((Math.random() * 5)+1);
	System.out.println(dg[i]);
	
	}while(sre==false) {
		int aciertos=0;
	int [] inte= new int [ng];
	for(int k=0;k<ng;k++) {
	inte [k]=sc.nextInt();
	}
	for(int j=0;j<ng;j++) {
		if(inte[j]<dg[j]) {
			 System.out.println("Posición " + (j + 1) + ": el número secreto es mayor");
		}
		if(inte[j]>dg[j]) {
			 System.out.println("Posición " + (j + 1) + ": el número secreto es menor");
		}
		if(inte[j]==dg[j]) {
			System.out.println("Bien hecho "+inte[j]);
			aciertos++;
		}	
	}
	if(aciertos==ng) {
		System.out.println("ACERTASTE TODOSSSSS");
	sre=true;
	}
	}
	sc.close();
	}
	
	}


