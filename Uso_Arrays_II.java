import javax.swing.JOptionPane;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] matriz_aleatorios=new int[150];
		
		for(int i=0;i<matriz_aleatorios.length;i++) {
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		int count=1;
		String salto="\n";
		for(int e:matriz_aleatorios) {
			System.out.print(e+", ");
			if((count%20)==0 && count!=0) {
				System.out.print(salto);
			}
			count++;
		}
		count=0;
		
		String [] paises= new String[8];
		paises[0]="España";
		paises[1]="México";
		paises[2]="Colombia";
		paises[3]="Perú";
		paises[4]="Chile";
		paises[5]="Argetina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";

		for(int i=0;i<paises.length;i++) {
			System.out.println("El pais en la posición "+ (i+1) + " es: "+ paises[i] );
		}
		
		for(String e: paises) {
			count++;
			System.out.println("El pais en la posición "+ count + " es: "+ e);
		}
		
		count=0;
		String [] cafes=new String[5];
		for (String e: cafes) {
			cafes[count]=JOptionPane.showInputDialog("Ingresa un nombre de cafe");
			count++;
		}
		count=0;
		for (String e:cafes) {
			System.out.println("El cafe cargado en la posicion "+count + " es "+ e);
			count++;
		}

	}

}
