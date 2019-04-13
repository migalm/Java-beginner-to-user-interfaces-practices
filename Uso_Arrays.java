
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mi_matriz=new int[5];

		mi_matriz[0]=5;
		mi_matriz[1]=38;	
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;
		
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		
		for (int i=0;i<mi_matriz.length;i++) {
			System.out.println("valor del indice " + i +" = "+ mi_matriz[i]);
		//Forma alternativa de declarar matrices
		}
		
		int [] mi_matriz3= {5,4,3,2,1}; //Declaracion implicita de matriz
		
		for (int i=0;i<mi_matriz3.length;i++) {
			System.out.println("valor del indice " + i +" = "+ mi_matriz3[i]);
		}

		
	}
}