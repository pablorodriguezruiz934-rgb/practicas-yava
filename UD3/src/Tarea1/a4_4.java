package Tarea1;
import java.util.Scanner;
public class a4_4 {
public static void mayor(int a,int b) {
if(a<b) {
	System.out.println("B ES MAYOR");
}if(b<a) {
	System.out.println("A ES MAYOR");
}
if(a==b) {
	System.out.println("Te amo");
}
}
public static void main(String[] args) {
	mayor(5,10);
	mayor(10,5);
	mayor(5,5);
}
}
