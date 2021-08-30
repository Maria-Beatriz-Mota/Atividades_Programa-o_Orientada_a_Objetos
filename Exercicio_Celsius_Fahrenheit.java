//convertendo de celsius para Fahrenheit
import java.util.Scanner;
public class Exercicio_Celsius_Fahrenheit {

	public static void main (String[] args) {
		
		//tempC == temperatura em Celsius e tempF == temperatura em Fahrenheit
		double tempC, tempF;
		
		System.out.println("digite a temperatura em Celsius: ");
		
			Scanner s = new Scanner(System.in);
			tempC = s.nextDouble();
		
		tempF = (9 * tempC)/ 5 + 32;	
			
		System.out.println("digite a temperatura em Fahrenheit é: "+tempF);
	}
}
