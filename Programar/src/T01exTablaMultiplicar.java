
public class T01exTablaMultiplicar {

	public static void main(String[] args) {
		// Tabla de multiplicar del 1 al 10
		
		int resultado;
		
		for ( int i = 1; i <= 10; i++){
			for ( int j = 1; j <= 10; j++){
				resultado = i * j;
				System.out.println( i + " * " + j + " = " + resultado);
			}
			System.out.println();
		}

	}

}
