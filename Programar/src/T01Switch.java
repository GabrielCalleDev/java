
public class T01Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		letra = 'p';
		
		switch (letra){
			case 'a':
				System.out.println("El valor es a.");
				break;
			case 'b':
				System.out.println("El valor es b.");
				break;
			case 'c':
				System.out.println("El valor es c.");
				break;
			default:
				System.out.println("Valor desconocido: " + letra);
		}
	}

}
