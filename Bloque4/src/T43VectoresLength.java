// Ordenar un vector de menor a mayor mediante el metodo de la burbuja.

public class T43VectoresLength {

	public static void main(String[] args) {
		
		// Normalmente se declara de la siguiente manera un vector:
		// int[] vector = new int[longitud];
		
		int[] vector = {1,2,5,12,63,12,97,34,5,12,34,5,2,56,1,43,12,11};
		int aux;
		
		// Para calcular el tamaño de un vector se usa el metodo .length en el objeto vector
		for (int i=0; i < vector.length; i++){
			System.out.print( vector[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i < vector.length; i++){
			for(int j=i+1; j<vector.length; j++){
				if(vector[j] < vector[i]){
					aux = vector[j];
					vector[j] = vector[i];
					vector[i] = aux;
				}
			}
		}
		for (int i=0; i < vector.length; i++){
			System.out.print( vector[i] + " ");
		}
	}
}