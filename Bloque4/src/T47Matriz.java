//Bloque Java 4.7: ¿Que es una matriz?

import java.util.Scanner;
public class T47Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Declaración de la matriz
		int [][] matriz = new int[2][2];
		
		// Rellenar matriz
		for (int i=0; i < matriz.length; i++){
			for (int j=0; j < matriz[0].length; j++){
				System.out.print("Introduce un número para el elemento matriz["+i+"]"+"["+j+"]");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		// Imprimir matriz
		for (int i=0; i < matriz.length; i++){
			for (int j=0; j < matriz[0].length; j++){
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println();
		}
					
	}

}
