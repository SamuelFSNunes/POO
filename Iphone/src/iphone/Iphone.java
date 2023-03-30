package iphone;

public class Iphone {
	public static void main(String[] args) {
		Spotify spotify = new Spotify();
		spotify.selecionar();
		spotify.play();
		spotify.pausar();
		
		System.out.println("\n");
		
		Telefone telefone = new Telefone();
		telefone.ligar();
		telefone.atender();
		telefone.correioVoz();
		
		System.out.println("\n");
		
		Internet internet = new Internet();
		internet.exibirPagina();
		internet.novaAba();
		internet.atualizarPagina();
	}

}
