package smart.tv.meu.projeto;

public class Comentarios {

	public static void main(String[] args) {
		// Olá, eu sou um comentário em uma única linha
		
		
		/*Teste,
		 * Comentário 
		 * em bloco.
		 */
		
		/**
		 * Estas duas estrelinhas acima
		 * é para identificar que você
		 * pretende elaborar um comentário
		 * a nível de documentação.		 *
		 */
		
	}
	
	public int somaMultiplica (int n, int x, String m) {
		int r = 0;
		if (m == "M") {
			r = n * x;
		}else {
			r = n + x;
		}
		return r;
	}
}
