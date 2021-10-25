import java.util.Scanner;

public class POO_start6_calcule_Y {
	public static void main (String []args) {
		double x;
		double y;
		System.out.println("coloque um valor para x e y");
		Scanner s = new Scanner(System.in);
		x = s.nextDouble();
		y = s.nextDouble();
		
		for(int i = 1; i <=100; i++) {
			y = y+ x + i;
		}
		System.out.println("o valor de Y é:"+y);
	}
	
	public static double calculo_Y(double x) {
		
		// declaração de variáveis
		double y = 0; 
		
		for (int i=1;i<=100;i++) {
			y = y + x + i;
		}
		return y;
	}
}

	    
