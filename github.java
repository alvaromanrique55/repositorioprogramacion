package programacion;

public class github {
	
	 public static void main(String[]args){
	        int[] numeros = new int[10];
	        int pos = 0, neg = 0, cero = 0; 
	        int i;
	       
	
	        System.out.println("Lectura de los elementos del array: ");
	        for (i = 0; i < numeros.length; i++) {
	            System.out.print("numeros[" + i + "]= ");
			System.out.println("");
	            
			
	        }
	       
	        for (i = 0; i < numeros.length; i++) {
	            if (numeros[i] > 0) {
	                pos++;
	            } else if (numeros[i] < 0) {
	                neg++;
	            } else {
	                cero++;
	            }
	        }
	     
	        System.out.println("Positivos: " + pos);
	        System.out.println("Negativos: " + neg);
	        System.out.println("Ceros: " + cero);
	        
	        System.out.println("este es el cambio ");
	        
	        
	    }
}


	
	
	
	
	


