package Estudiar;
import java.util.Scanner;
public class ej8_15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int contadorP= 0;
	
	for(int i=0;i<=n;i++) {
		int divisores = 0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				 divisores++;
			}
		}
if (divisores==2) {
	contadorP++;
	System.out.println(i+" Es primo");
	
}

	}
	System.out.println("Hay " + contadorP+ " números primos entre 1 y "+n);
	sc.close();
}
}
