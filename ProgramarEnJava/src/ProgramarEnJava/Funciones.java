package ProgramarEnJava;
// Interesante: http://code.runnable.com/

public class Funciones {
	// Separador que pide el tipo y cantidad
	static void InsertarSeparador(String caracter, int cantidad){
		for (int i=0; i < cantidad; i++){
			System.out.print(caracter);
		}
		System.out.println();
	}
	// Inserta un salto de linea
	static void InsertarSaltoDeLinea(){
		System.out.println();
	}
	static void InsertarSaltoDeLinea(int a){
		for (int i=0; i<a; i++){
			System.out.println();	
		}
	}

	// Suma de dos números
	static int Suma(int a, int b){
		int suma;
		suma = a + b;
		return suma;
	}
	
	static void ImprimirResultadoSuma(int a){
		System.out.println("El resultado de la suma es la siguiente: " + a);
	}
}