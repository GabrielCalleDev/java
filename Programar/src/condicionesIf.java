import java.util.Scanner;
public class condicionesIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, comparar;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce el comparador: ");
		comparar = s.nextInt();
		System.out.print("Introduce el n�mero a comparar: ");
		numero = s.nextInt();
		
		/*
		 * Condiciones: "=="; "<"; "<="; ">"; ">="; "!="
		 * 
		if ( condicion1 ){
			instrucciones
		}
		else if ( condicion2 ){
			instrucciones
		}
		else{
			instrucciones
		}
		*/
				 
		if ( numero == comparar ){
			System.out.println("Los n�meros introducidos son iguales: " + comparar + " .");
		}
		else{
			System.out.println("El n�mero no es " + comparar + ". El n�mero es: " + numero );
		}
	}
}
