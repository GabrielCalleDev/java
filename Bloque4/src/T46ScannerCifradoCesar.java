//Bloque Java 4.6: Scanner y Cifrado de Cesar

import java.util.Scanner;
public class T46ScannerCifradoCesar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String frase1, frase2="";
		int desplazamiento;	
		String min = "abcdefghijklmnopqrstuvwxyz ";
		String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		
		System.out.print("Introduce una frase: ");
		frase1 = entrada.nextLine();
		
		System.out.print("Introduce la clave de desplazamiento: ");
		desplazamiento = entrada.nextInt();
		
		for (int i=0; i<frase1.length(); i++){
			for(int j = 0; j<min.length(); j++){
				if(frase1.charAt(i) == min.charAt(j)){
					if(j + desplazamiento >= min.length()){
						frase2 += min.charAt((j + desplazamiento) % min.length());
					}
					else{
						frase2 += min.charAt(j + desplazamiento);
					}
				}
				else if(frase1.charAt(i) == may.charAt(j)){
					if(j + desplazamiento >= may.length()){
						frase2 += may.charAt((j + desplazamiento) % may.length());
					}
					else{
						frase2 += may.charAt(j + desplazamiento);
					}
				}
			}
		}
		System.out.println(frase1);
		System.out.println(frase2);
	}
}