package tarea3;
import java.util.Scanner;
public class actividad9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	double [] n = new double[5];
	
	for(int i=0;i<n.length;i++) {
		System.out.println("introduce el numero: "+i);
		n[i]=sc.nextDouble();
		
	}
	for(int i=0;i<n.length;i++) {
		System.out.println(n[i]);
	}
	sc.close();
}
}
