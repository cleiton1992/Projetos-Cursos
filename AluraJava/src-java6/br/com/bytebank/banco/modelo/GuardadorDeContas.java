package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref; 	//pega a posi��o que esta livre e coloca dentro do array referencias[]
		this.posicaoLivre ++;	//contador. acrescenta mais 1 a variavel auxiliar para que na proxima execu��o tenha um valor livre
	
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;			//retorna o valor da variavel livre
	}

	public Conta getReferencia(int pos) {
	return this.referencias[pos];	
	
	}
	
	
	
	
	

}
