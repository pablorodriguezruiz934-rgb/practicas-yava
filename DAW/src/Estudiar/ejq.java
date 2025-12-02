package Estudiar;
import java.util.Scanner;
public class ejq {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Altura");
	int alt = sc.nextInt();
	int bas = (alt/2)+1;
	for(int i=1;i<=alt;i++) {
		System.out.println("*");
	}
		for(int j=1;j<=bas;j++) {
			System.out.print("*");
		}
	sc.close();
}
}
