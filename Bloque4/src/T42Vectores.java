// Programa para calcular la media de un vector.

import java.util.Scanner;
public class T42Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitud;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la longitud del vector: ");
		longitud = entrada.nextInt();
		
		double[] vector = new double[longitud];
		double total = 0;
		
		for (int i=0; i < longitud; i++){
			System.out.print("Introduce un valor en la posición " + i + ": ");
			vector[i] = entrada.nextDouble();
		}
		
		for (int i=0; i < longitud; i++){
			total += vector[i];
		}
		
		total /= longitud;
		System.out.println("La media es: " + total);
	}

}
