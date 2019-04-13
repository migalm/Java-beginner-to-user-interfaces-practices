import javax.swing.JOptionPane;

public class Comprueba_Mail {

	public static void main(String[] args) {
		// Evaluacion de caracteres, se emplea el metodo CharAt de la clase String.
		boolean arroba=false;
		String mail=JOptionPane.showInputDialog("Introduce mail: ");
		//Se recorre con un bucle for en busca del arroba.
		for(int i=0; i<mail.length(); i++ ) {
			if (mail.charAt(i)=='@') { //Los datos de tipo char van entre comilla simple 
				arroba=true;
			}
		}
		if(arroba==true) {
			System.out.println("El mail es correcto");	
		}
		else {
			System.out.println("El mail no es correcto");
		}
		
		
	}

}
