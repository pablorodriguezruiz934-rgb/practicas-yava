package prep1;

import java.util.Scanner;

public class a3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	 //Introducir por teclado un número n; a continuación solicitar
	// al usuario que teclee n números. Realizar la media de los números positivos, la media de los negativos, y contar el número de ceros introducidos.
	double n=sc.nextDouble();
	double [] num=new double [(int) n];
	double sun=0;
	double sup=0;
	double sunc=0;
	double supc=0;
	double cero=0;
	for(int i=0;i<num.length;i++) {
		num [i]=sc.nextDouble();
		if(num[i]<0) {
			sun=sun+num[i];
		}
		if(num[i]>0) {
			sup=sup+num[i];
		}
		if(num[i]<0) {
			 sunc++;
		}
		if(num[i]>=0) {
			 supc++;
		}
		if(num[i]==0) {
			cero++;
		}
	}
		System.out.println((sun/sunc)+" "+(sup/supc)+" "+cero);
}
}
