package tarea3;

public class actividad6 {
	public static int[] sinRepetidos(int t[]) {
	    if (t == null || t.length == 0) {
	        return new int[0];
	    }

	    
	    int[] temp = new int[t.length];
	    int contador = 0;

	   
	    for (int i = 0; i < t.length; i++) {
	        int actual = t[i];
	        boolean repetido = false;

	      
	        for (int j = 0; j < contador; j++) {
	            if (temp[j] == actual) {
	                repetido = true;
	                break;
	            }
	        }
	        if (!repetido) {
	            temp[contador] = actual;
	            contador++;
	        }
	    }
	    int[] resultado = new int[contador];
	    for (int i = 0; i < contador; i++) {
	        resultado[i] = temp[i];
	    }

	    return resultado;
	}
}
