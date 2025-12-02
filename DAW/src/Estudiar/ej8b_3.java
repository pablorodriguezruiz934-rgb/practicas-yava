package Estudiar;
import java.util.Scanner;
import java.util.Scanner;

public class ej8b_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce la n");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		
		for (int i = 0; i < n; i++) {
		    System.out.println(a);
		    int siguiente = a + b;
		    a = b;
		    b = siguiente;
		}

		}
	}

