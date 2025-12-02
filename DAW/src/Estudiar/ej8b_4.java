package Estudiar;
import java.util.Scanner;
public class ej8b_4 {
	public static void main(String[] args) {
		int negativos=0;
		int positivos=0;
	
Scanner sc= new Scanner(System.in);
for(int i=1;i<=10;i++) {
	int i1= sc.nextInt();
	
	if(i1<0) {
		negativos++;
	}
	if(i1>=0) {
		positivos++;
	}
	
}
System.out.println("Hay "+positivos+" positivos y "+ negativos+" negativos");
sc.close();
}
}
