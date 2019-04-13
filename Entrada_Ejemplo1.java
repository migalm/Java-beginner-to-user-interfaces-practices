import java.util.Scanner;

public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		// Construccion de un objeto Scanner
		Scanner var=new Scanner(System.in);
		System.out.println("Introduce tu nombre por favor: ");
		String askname=var.nextLine();
		System.out.println("El nombre que usted ha introducido es: "+ askname);
		System.out.println("Introduce tu edad por favor: ");
		int edad=var.nextInt();
		System.out.println("la edad introducida es: "+ edad);
		System.out.println("El año que viene tendras "+ (edad+1));
		var.close();
	}

}
