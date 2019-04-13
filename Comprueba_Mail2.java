import javax.swing.JOptionPane;

public class Comprueba_Mail2 {

	public static void main(String[] args) {
		// Evaluacion de caracteres, se emplea el metodo CharAt de la clase String.
		int arroba=0;
		boolean punto=false;
		String mail=JOptionPane.showInputDialog("Introduce mail: ");
		//Se recorre con un bucle for en busca del arroba.
		for(int i=0; i<mail.length(); i++ ) {
			if (mail.charAt(i)=='@') { //Los datos de tipo char van entre comilla simple 
				arroba++;
			}
			else if(mail.charAt(i)=='.') { //se evalua la condicion de tener puntos en el correo
				punto= true;
			}
		} 
		if(arroba==1 && punto==true) { //condicion verdadera en caso de contar con @ y con uno o más puntos
			System.out.println("El mail es correcto");	
		}
		else {
			System.out.println("El mail no es correcto");
		}
		
		
	}

}
