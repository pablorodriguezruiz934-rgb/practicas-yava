package Estudiar;

import java.util.Scanner;

public class qa {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de a , el de b y el numero de la ecuacuion ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double num1=sc.nextDouble();
        if (a==0)
        	System.out.println("Math error");
        
        double x=(double) (num1-b)/a;
System.out.println("x="+x);
        sc.close();
    
}
}