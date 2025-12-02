package Tarea1;

import java.util.Scanner;

public class act1 {
public static void eco(int n) {
	Scanner sc = new Scanner(System.in);
	 n=sc.nextInt();
	for (int i = 0; i < n; i++) {
        System.out.println("Eco...");
    }
}

public static void main(String[] args) {
    eco(3);
}
}


