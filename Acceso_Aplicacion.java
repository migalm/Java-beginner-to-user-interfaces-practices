import javax.swing.*;
public class Acceso_Aplicacion {

	public static void main(String[] args) {
		String clave="Juan";
		String pass="";
		
		while (clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contraseña por favor");
			if (clave.equals(pass)==false){
				System.out.println("contraseña incorrecta");
				
			}
		}
		System.out.println("Contraseña correcta, acceso permitido");
	}

}
