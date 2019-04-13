import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=1000.0;
		System.out.printf("%1.2f", x/3 ); //en el 1.2 el 2 significa el numero de decimales despues del punto.
		System.out.println();
		String num1=JOptionPane.showInputDialog("Introduce  un número por favor: ");
		double num2=Double.parseDouble(num1);
		System.out.println("=============================================");
		System.out.print("La raiz cuadrada del número " + num1 + " es: ");
		double raiz=Math.sqrt(num2);
		System.out.printf("%1.2f", raiz);
	}

}
