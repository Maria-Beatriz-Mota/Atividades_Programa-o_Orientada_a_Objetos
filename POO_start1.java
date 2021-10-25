public class POO_start1 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 15;
		int resposta = soma(n1, n2);
		System.out.println("A soma dos números deu: "+resposta);
	}
	public static int soma(int x1, int x2)  {
		int soma = 0;
    		soma = x1 + x2;
    		return soma;
	}
}