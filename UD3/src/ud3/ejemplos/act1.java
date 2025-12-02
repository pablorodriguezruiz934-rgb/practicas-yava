package ud3.ejemplos;

import java.util.Scanner;

public class act1 {
public static void main(String[] args) {
	Scanner sc = new Scanner  (System.in);
	double [] num =new double[5];
	for(int i=0;i<num.length;i++) {
		System.out.println("introduce el numero :"+(i+1));
		num[i]=sc.nextDouble();
	}
	for(int j=0;j<num.length;j++) {
	System.out.println(num[j]);
	}
}
}
