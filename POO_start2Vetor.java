public class POO_start2Vetor {

	public static void main(String[] args) {
			double x[] = {10,20,30};
			double resposta = media(x);
			System.out.println("A média dos valores do vetor é: "+resposta);
		}
		public static double media(double[] v)  {
			double soma = 0, media = 0;
			for (int i = 0; i< v.length; i++)  {
				soma = soma + v[i];
			}
			media = soma / v.length;
			return media;
		}
	}
