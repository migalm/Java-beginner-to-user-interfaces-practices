import javax.swing.*;
public class Acceso_Aplicacion {

	public static void main(String[] args) {
		String clave="Juan";
		String pass="";
		
		while (clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contraseņa por favor");
			if (clave.equals(pass)==false){
				System.out.println("contraseņa incorrecta");
				
			}
		}
		System.out.println("Contraseņa correcta, acceso permitido");
	}

}
