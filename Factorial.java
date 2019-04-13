import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long resultado=1L;
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		//Nota, el factorial de cero "0!" es 1.
		if(numero>=0) {
			for(int i=numero;i>0;i--) {
				resultado=resultado*i;
			}
		
			System.out.println("El resultado del factorial es: "+ resultado);
		}

		else {
			System.out.println("El valor introducido es negativo, ingresa un numero positivo por favor");
		}		
	}

}
