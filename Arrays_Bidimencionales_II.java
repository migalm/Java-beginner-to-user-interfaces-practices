
public class Arrays_Bidimencionales_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		double interes=0.01;
		
		double [][] saldo = new double [6][5];
		for (int i=0; i<6; i++) {
			saldo [i][0]=10000;
			acumulado=10000;
			for(int j=1; j<5; j++) {
				acumulado=acumulado + (acumulado*interes);
				saldo[i][j]=acumulado;
			}
			interes=interes+0.01;
		}
		
		
		
		for(int i=0;i<saldo.length;i++) {
			//System.out.println(i);
			for(int e=0;e<saldo[i].length;e++) {
				System.out.printf("%1.2f",saldo [i][e]);
				System.out.print("  ");
			}
			System.out.print("\n");	
		}
	
	}

}
