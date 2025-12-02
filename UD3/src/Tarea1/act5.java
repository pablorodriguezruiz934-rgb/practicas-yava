package Tarea1;

public class act5 {

    public static void mayor3(int a, int b, int c) {

        int mayorAB;

       
        if (a > b) {
            mayorAB = a;
        } else {
            mayorAB = b;
        }

        
        if (mayorAB == a && a > c) {
            System.out.println("a es mayor");
        } else if (mayorAB == b && b > c) {
            System.out.println("b es mayor");
        } else {
            System.out.println("c es mayor");
        }
    }

    public static void main(String[] args) {
        mayor3(2, 7, 5);
        mayor3(9, 3, 1);
        mayor3(4, 4, 9);
    }
}
