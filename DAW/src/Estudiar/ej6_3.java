package Estudiar;
import java.util.Scanner;
public class ej6_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
int par = (n%2);
if(par==0) {
	System.out.println("par "+ n);
}else{
		System.out.println("impar "+ n);
}
sc.close();
}
}