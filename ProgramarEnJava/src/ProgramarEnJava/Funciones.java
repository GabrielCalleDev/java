package ProgramarEnJava;
// Interesante: http://code.runnable.com/ 
// En esta clase se definen algunas funciones utiles.

public class Funciones {
	// Separador que pide el tipo de separador y cantidad
	// Ejemplo: InsertarSeparador("*", 5'); --> Dara como resultado imprimir el '*' multiplicado 5 veces, seguido de un salto de linea. 
	// Resultado ejemplo: ***** \n 
	static void InsertarSeparador(String caracter, int cantidad){
		for (int i=0; i < cantidad; i++){
			System.out.print(caracter);
		}
		System.out.println();
	}
	// Funciones para insertar saltos de linea
	// ***************************************
	// Esta funcion inserta un salto de linea
	static void InsertarSaltoDeLinea(){
		System.out.println();
	}
	// Esta funcion inserta n saltos de linea insertados por parametro.
	static void InsertarSaltoDeLinea(int a){
		for (int i=0; i<a; i++){
			System.out.println();	
		}
	}
	// Suma de dos números pasados por parametros
	static int Suma(int a, int b){
		return a + b;
	}
	// Imprimir entero pasado por parametro
	static void ImprimirResultadoSuma(int a){
		System.out.println("El resultado de la suma es la siguiente: " + a);
	}
}