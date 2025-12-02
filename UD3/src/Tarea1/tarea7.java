package Tarea1;

public class tarea7 {
public static boolean nump(int a) {
	if(a%2==0) {
		System.out.println("Par");
	}else {
		System.out.println("imPar");
	}
	return (a%2==0);
}
public static void main(String[] args) {
	System.out.println(nump(3));
	System.out.println(nump(8));
}
}