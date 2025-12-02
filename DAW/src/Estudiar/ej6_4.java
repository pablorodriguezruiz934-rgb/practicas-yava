package Estudiar;
import java.util.Scanner;
public class ej6_4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	byte n1 = sc.nextByte();
	byte n2 = sc.nextByte();
byte menor;
	if(n1<n2) {
		menor=n1;
		
		System.out.println("n1 es el menor "+menor);
	}else {
		menor=n2;
		System.out.println("n2 es el menor "+menor);
	}
	sc.close();
}

}
