package iphone;

public class Spotify {
	public void selecionar() {
		System.out.println("Musica selecionada");
	}
	public void play() {
		conferirInternet();
		conferirArquivo();
		System.out.println("Musica iniciada");
	}
	public void pausar() {
		System.out.println("Musica pausada");
	}
	private void conferirInternet(){
		System.out.println("Conferindo internet");
	}
	private void conferirArquivo() {
		System.out.println("Conferindo arquivo de audio");
	}
}
