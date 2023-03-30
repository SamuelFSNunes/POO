package iphone;

public class Internet {
	public void exibirPagina() {
		estabelecerConexao();
		enviarRequisicao();
		lerResposta();
		System.out.println("Exibindo pagina web");
	}
	public void novaAba() {
		estabelecerConexao();
		enviarRequisicao();
		lerResposta();
		System.out.println("Exibindo nova aba");
	}
	public void atualizarPagina() {
		estabelecerConexao();
		enviarRequisicao();
		lerResposta();
		System.out.println("Atualizando pagina");
	}
	private void estabelecerConexao() {
		System.out.println("Estabelecendo conexao com a internet");
	}
	private void enviarRequisicao() {
		System.out.println("Enviando requisicao para o navegador");
	}
	private void lerResposta() {
		System.out.println("Lendo resposta da requsicao");
	}
}