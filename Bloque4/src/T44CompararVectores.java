// Comparar vectores
public class T44CompararVectores {

	public static void main(String[] args) {
		// Normalmente se declara de la siguiente manera un vector:
		// int[] vector = new int[longitud];
		
		int[] v1 = {4,6,7,8};
		int[] v2 = {4,6,7,8,7};
		
		boolean iguales = true;
		
		// Se compara la longitud de los vectores para ver si son iguales.
		if( v1.length != v2.length){
			iguales = false;
		}
		
		// Si los vectores son iguales se compara si los valores de los vectores son iguales
		for (int i=0; i < v1.length && iguales; i++){
			if(v1[i] != v2[i] ){
				iguales = false;
			}
		}
		
		if(iguales){
			System.out.println("Ambos vectores son iguales.");
		}
		else{
			System.out.println("Ambos vectores NO son iguales.");
		}
	}

}
