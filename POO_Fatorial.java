import java.util.Scanner;
public class POO_Fatorial {
	public static void main(String[] args)  {
		int n = 0, r = 0;
	Scanner s = new Scanner(System.in);
		System.out.println("digite o n�mero para c�lculo do fatorial:");
		n = s.nextInt();
		r = fatorial(n);
		System.out.println("O fatorial de " + n + " �: " + r);
}
public static int fatorial(int numero)  {
		int fatorial = 1;
		for (int i = numero; i> 0; i--)  {
			fatorial = fatorial*i;
		}
		return fatorial;
	}
}

