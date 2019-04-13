import javax.swing.JOptionPane;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		/*Empleo de JOptionPane, se despliega un menu para el usuario en 
		una ventana donde ingresa los valores*/
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor");
		String edad=JOptionPane.showInputDialog("Introduce tu edad por favor");
		int convedad=Integer.parseInt(edad);
		convedad++;
		System.out.println("Gracias por ingresar tu nombre " + nombre_usuario +"tienes " + edad
				+ " años, el año que viene tendrás " + (convedad));

	}

}
