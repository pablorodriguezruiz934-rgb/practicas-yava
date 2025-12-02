package Estudiar;
import java.util.Scanner;

public class ej8_10 {
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Introduce un numero del 1 al 10");
	  int num = sc.nextInt();
	  
	  while(num<1 || num>10) {
		  System.out.println("Numero no valido");
		  num = sc.nextInt();
}

	  for(int i=1;i<=10;i++) {
		  System.out.println(num*i);
		  
	  }
}
}