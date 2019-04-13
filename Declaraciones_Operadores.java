
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		final double tolit=3.7854; /*declaracion de constante, posteriomente se vera el concepto de constante
		de clase, misma que es una constante que comparten todos los metodos de una misma clase*/
		double convgal= 42*tolit;
		System.out.println("El total en litros de 42 galones es:"+convgal+ " litros.");
		//se pueden declarar multiples variables en la misma linea
		double op1, op2, op3, res;
		op1=12.5;
		op2=4.5;
		op3=22.3;
		res=op1*op2/op3;
		System.out.println("El resultado aritmetico es:"+res);
		
	}

}
