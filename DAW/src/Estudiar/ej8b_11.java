package Estudiar;
import java.util.Scanner;
public class ej8b_11 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int alt= sc.nextInt();
	
	while(alt%2==0) {
		System.out.println("Error");
		alt= sc.nextInt();
	}
		for(int i=0;i<alt;i++) {
			for(int j=0;j<alt;j++) {
				if(i==j||j==alt -1 -i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

}
}

