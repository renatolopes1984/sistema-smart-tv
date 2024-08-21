package smart.tv.meu.projeto;

public class Usuario {

	public static void main(String[] args) throws Exception {

		SmartTv smartTv = new SmartTv(); //OBJETO
		
		System.out.println("A TV está ligada? " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();

		smartTv.mudarCanal(28);
		System.out.println("Canal atual: " + smartTv.canal);

	}

}
