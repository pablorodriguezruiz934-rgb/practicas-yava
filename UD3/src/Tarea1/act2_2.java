package Tarea1;

public class act2_2 {
public static void entre(int a,int b) {
	if(a<b) {
	for(int i=a;i<b;i++) {
		System.out.println(i);
	}
	}
	if(b<a) {
		for(int i=b;i<a;i++) {
			System.out.println(i);
		}
		}
}
public static void main(String[] args) {
	entre(1000,100);
}
}
