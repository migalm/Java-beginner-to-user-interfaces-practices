import java.util.Scanner;

//Empleo de clases enumeradas


public class Uso_Tallas {
	//enum Talla{MINI, MEDIANO, GRANDE,MUY_GRANDE};
	enum Talla{
		MINI("S"), MEDIANO("M"), GRANDE("G"),MUY_GRANDE("XL");
		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		public String dameAbreviatura() {
			return abreviatura;
		}
				
		private String abreviatura;
	}

	
	public static void main(String[] args) {
		/*Talla s= Talla.MINI;
		Talla m= Talla.MEDIANO;
		Talla g= Talla.GRANDE;
		Talla xl= Talla.MUY_GRANDE;*/
		
		String seleccion;
		Scanner sc = new Scanner(System.in);
		String salida="quit";
		String pase="";
		
		while(salida.equalsIgnoreCase(pase)==false) {
			System.out.println("Escoge una talla MINI, MEDIANO, GRANDE o MUY_GRANDE \n"
								+ "presione 'quit' para salir");
			seleccion =sc.next().toUpperCase();
		
			if(seleccion.equalsIgnoreCase("MINI") || seleccion.equalsIgnoreCase("MEDIANO")
					|| seleccion.equalsIgnoreCase("GRANDE")|| seleccion.equalsIgnoreCase("MUY_GRANDE")) {
				Talla la_talla=Enum.valueOf(Talla.class, seleccion);
				System.out.println("Talla seleccionada: " + la_talla +".\n"+
									"Abreviatura: "+la_talla.dameAbreviatura()+".\n");
			}
			else if(seleccion.equalsIgnoreCase("quit")) {
				pase="quit";
			}else {
				System.out.println("Los datos introducidos no coinciden con alguna talla. \n");
			}
			
		}
		sc.close();
	}

}
