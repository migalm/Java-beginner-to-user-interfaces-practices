
public class Arrays_Bidimencionales {

	public static void main(String[] args) {
		int [] [] matrix = new int[4][5];
		int [] [] matrix2= {
				{1},
				{2,3},
				{4,5,6},
				{7,8,9,10},
				{11,12,13,14},
				{7,8,9,10},
				{4,5,6},
				{2,3},
				{1},
		};
		matrix [0][0]=15;
		matrix [0][1]=21;
		matrix [0][2]=18;
		matrix [0][3]=9;
		matrix [0][4]=15;
		
		matrix [1][0]=10;
		matrix [1][1]=52;
		matrix [1][2]=17;
		matrix [1][3]=19;
		matrix [1][4]=7;

		matrix [2][0]=19;
		matrix [2][1]=2;
		matrix [2][2]=19;
		matrix [2][3]=17;
		matrix [2][4]=7;
		
		matrix [3][0]=92;
		matrix [3][1]=13;
		matrix [3][2]=13;
		matrix [3][3]=32;
		matrix [3][4]=41;
		
		for(int i=0;i<4;i++) {
			for(int e=0;e<5;e++) {
				System.out.print( matrix [i][e]+" ");
			}
			System.out.print("\n");	
		}
		
		System.out.print("======================\n");	
		
		for(int i=0;i<matrix.length;i++) {
			//System.out.println(i);
			for(int e=0;e<matrix[i].length;e++) {
				System.out.print( matrix [i][e]+" ");
				//System.out.println(i +" "+ e);
			}
			System.out.print("\n");	
		}
		System.out.print("======================\n");
		
		//Sintaxis para demostrar el acceso a un arreglo no simétrico.
		for(int i=0;i<matrix2.length;i++) {
			//System.out.println(i);
			for(int e=0;e<matrix2[i].length;e++) {
				System.out.print( matrix2 [i][e]+" ");
				//System.out.println("valor de i: "+ i +", valor de e: "+ e);
			}
			System.out.print("\n");	
		}
		/*Empleo de bucle for mejorado "for each" se pasa cada uno de los renglones en fila y el valor se muestra *
		copiando el valor en el arreglo*/
		for(int[] fila: matrix2) {
			for(int valor:fila) {
				System.out.print( valor+" ");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
