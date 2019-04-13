import java.util.Scanner;

public class Evalua_Edad {

	public static void main(String[] args) {
		
		Scanner var=new Scanner(System.in);
		
		String clave="quit";
		String pass="";

		while (clave.equals(pass)==false) {
			System.out.println("Introduce tu edad por favor");
			int uedad=var.nextInt();
			if (uedad<=18) {
				System.out.println("Usted es un adolecente");
			}
			else if(uedad<40){
				System.out.println("Usted es un joven");
			}
			else if(uedad<65) {
				System.out.println("Usted es alguien maduro");
			}
			else{
				System.out.println("Usted aun es un adutlo mayor, cuidese.");
			}
			
			System.out.println("Escriba 'quit' si desea salir del programa:"); 
			pass=var.next();
			if (clave.equals(pass)==true) { //el programa continua su ejecucion mientras el usuario ingrese un valor de cero
				System.out.println("saliendo del sistema, gracias.");;
			}else {
				System.out.println("El programa continuará en ejecución.");
			}
		}
		var.close();
	}

}


