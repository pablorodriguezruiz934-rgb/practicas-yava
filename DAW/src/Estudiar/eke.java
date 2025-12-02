package Estudiar;
import java.util.Scanner;
public class eke {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int alt = sc.nextInt();
	int base = (alt/2)+1;
	
	for (int i=1;i<=alt;i++) {
			System.out.println("*");
		}
	for(int j=1;j<=base;j++) {
		System.out.print("*");
	}
	System.out.println();
	sc.close();
}
}
