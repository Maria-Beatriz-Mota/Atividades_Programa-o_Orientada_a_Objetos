import java.util.Scanner;
public class media_do_vetor {

	public static void main(String[] args) {
		
			int vetor[]= new int[10];
			double soma = 0, media;
			Scanner s = new Scanner(System.in);
		for(int i = 0; i < vetor.length; i++ ) {
			System.out.println("digite o valor do vetor: ");
			vetor[i] = s.nextInt(); 
			soma = soma+vetor[i];
		}
		media = soma/vetor.length;
		System.out.println("A media é: " +media);
			}		
	}