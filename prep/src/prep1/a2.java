package prep1;

import java.util.Scanner;

public class a2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	double [] num=new double [5];
	for(int i=0;i<num.length;i++) {
		num[i]=sc.nextDouble();
		
	}
	for(int j=num.length-1;j>=0;j--) {
		System.out.println(num[j]);
	}
}
}
