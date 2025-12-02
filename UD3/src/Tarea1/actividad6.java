package Tarea1;

public class actividad6 {
public static boolean detectavolcal(char a) {
	
	a=Character.toLowerCase(a);
	
	 return (a=='a'||a=='e'||a=='i'||a=='o'||a=='u') ;
}
public static void main(String[] args) {
	System.out.println(detectavolcal('a'));
	System.out.println(detectavolcal('b'));
}
}
