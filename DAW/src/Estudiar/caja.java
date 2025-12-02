package Estudiar;
import java.util.Scanner;
public class caja {
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
	int a=2,b=5,c=0,d=1;
	int intentos=4;
	boolean ab=false;
	System.out.println("Introduce la contraseña");

	while(intentos>0&&ab==false) {
		int i1= sc.nextInt();
		int i2= sc.nextInt();
		int i3= sc.nextInt();
	int	 i4= sc.nextInt();
		
		
		
		if(i1==a&&i2==b&&i3==c&&i4==d) {
			ab=true;
			System.out.println("Abierta "+intentos);
		}else {
				intentos--;
			System.out.println("Error te quedan "+intentos+" intentos");
		}
		if(intentos==0) {
			System.out.println("Permanece cerrada");
		}
	}
	}
	
}
