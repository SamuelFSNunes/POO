package iphone;

public class Telefone {
	public void ligar() {
		conferirNumero();
		estabelcerRota();
		System.out.println("Chamada iniciada");
	}
	public void atender() {
		estabelcerRota();
		System.out.println("Atendido");
	}
	public void correioVoz() {
		abrirCorreio();
		System.out.println("A mensagem a seguir ira para a caixa de voz, comece a falar depois do bip *BIP*");
	}
	private void conferirNumero() {
		System.out.println("Conferindo se numero de telefone e existente");
	}
	private void estabelcerRota() {
		System.out.println("Estabelecendo rota");
	}
	private void abrirCorreio() {
		System.out.println("Abrindo correio de voz");
	}
	
}
