package tarea3;

import java.util.Scanner;

public class actividad7 {

public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	final int trimestres =3;
	final int alumnos=5;
	int [][] notasclase=new int [trimestres][alumnos];
for(int i=0;i<trimestres;i++) {
	System.out.println("trimestre: "+(i+1));
	for(int j=0;j<alumnos;j++) {
		System.out.println("alumno: "+(j+1)+" introduce notas");
		notasclase[i][j]=sc.nextInt();
		 
			
		
	}
}
for(int i=0;i<trimestres;i++) {
	int med=0;
	for(int j=0;j<alumnos;j++) {
		med=med+notasclase[i][j];
	}
	float mediat=med/alumnos;
	System.out.println("Media alumnos: "+mediat);
}
int sumal=sc.nextInt()-1;
for(int i=0;i<trimestres;i++) {
	
}

	
	
}	
}
