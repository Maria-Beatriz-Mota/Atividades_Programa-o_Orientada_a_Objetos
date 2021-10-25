import java.util.Scanner;
public class POO_Potencia_sem_Função_POW {

	public static void main(String[] args) {
		double n1;
		int n2;
		double x = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("valor de n1");
		n1 = s.nextDouble();
		System.out.println("valor de n2");
		n2 = s.nextInt();
		
		for(int i = 1; i<=n2; i++) {
			x = x*n1;
		}
		System.out.println("o valor de "+n1+"^"+n2+" = "+x);
	}
	public static double potencia(double n1, int n2) {

	     double x=1; 

		for (int i=1;i<=n2;i++) {
			x=x*n1;
		}
		return x; 
	}
}
