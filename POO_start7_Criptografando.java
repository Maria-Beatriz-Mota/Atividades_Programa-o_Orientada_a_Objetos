
public class POO_start7_Criptografando {
	public static void main(String[] args)  {
		String s = "Vamos atacar a cidade alta as duas horas";
		System.out.println("resultado: "+encriptar(3,s));
	}


	public static String encriptar(int chave, String texto){

		// Variável que irá guardar o texto cifrado
		StringBuilder textoCifrado = new StringBuilder();

		int tamanhoTexto = texto.length();

		int letraCifradaASCII;

		// Criptografa cada caractere por vez 
		for(int c=0; c < tamanhoTexto; c++){
			// Transforma o caracter em codigo ASCII e criptografa
			int letranormal = ((int) texto.charAt(c));
			// não criptografa espaço.
			if (letranormal != 32)
				letraCifradaASCII = ((int) texto.charAt(c)) + chave;
			else
				letraCifradaASCII = ((int) texto.charAt(c));
			
	// Verifica se o codigo ASCII esta no limite dos 			// caracteres imprimiveis
			while(letraCifradaASCII > 126)  {
				letraCifradaASCII -= 94;
			}
			// Transforma codigo ASCII criptografado em 			// caracter ao novo texto
			textoCifrado.append( (char)letraCifradaASCII );
		}
			
		// retorna a mensagem criptografada 
		return textoCifrado.toString();
	}

}
