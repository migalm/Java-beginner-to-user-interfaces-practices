import java.util.Scanner;

public class Adivina_Numero {

	public static void main(String[] args) {
		// Generacion de un numero al azar con aproximación mediante pistas
		System.out.println(Math.random()*100);
		//empleo de metodo de refundicion, conversion de dato double en entero
		int aleatorio=(int)(Math.random()*100);
		System.out.println(aleatorio);
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		while(numero != aleatorio) {
			System.out.println("Indroduce un numero por favor");
			numero=entrada.nextInt();
			if (aleatorio<numero) {
				System.out.println("el numero introducido es mas bajo");
			}
			else if (aleatorio > numero) {
				System.out.println("eL numero intorducido es mas alto");
			}
			intentos++;
		}
		System.out.println("Has introducido en numero correcto, felicidades!!");
		System.out.println("la cantidad total de intentos ha sido de " + (intentos));
		entrada.close();
	}

}
