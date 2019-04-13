
public class Manipula_Cadenas_II {

	public static void main(String[] args) {
		//Muestra del funcionamiento del metodo substring
		String frase="Hoy es un estupendo día para aprender Java";
		//Se pretende extraer la frase - aprender a programar en Java-.
		String frase_resumen=frase.substring(24,frase.length())+" e irnos a la playa y olvidarnos de todo";
		System.out.println(frase_resumen);
		String frase_sep=(String)frase.subSequence(24, frase.length()); //notose como se efectua un casting y/o refundicion.
		System.out.println(frase_sep);
	}

}
