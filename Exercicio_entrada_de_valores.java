import java.util.Scanner;
public class Exercicio_entrada_de_valores {
	
	public static void main (String[] args) {
		
		double nota1 = 0,nota2 = 0, media = 0;
	
			System.out.println("Digite a primeira e segunda nota: ");
			
			//entrada de valores//
				Scanner s = new Scanner(System.in);
				nota1 = s.nextDouble();
				nota2 = s.nextDouble();
				
				media = (nota1 + nota2)/2;
				
			System.out.println("A média é: "+media);
		
		
		
	}

}
