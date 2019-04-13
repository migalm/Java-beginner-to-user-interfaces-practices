
public class Manipula_Cadenas {

	public static void main(String[] args) {
		String nombre= "Ana Laura Gonzalez Rios";
		int lnom= nombre.length()-1;
		System.out.println("Mi nombre es: "+ nombre);
		System.out.println("La longitud de mi nombre es de: "+ lnom + " caracteres");
		System.out.println("La primera letra de mi nombre es: "+ nombre.charAt(0)+", y la última letra de "
				+ "mi nombre es:"+ nombre.charAt(lnom));


	}

}
