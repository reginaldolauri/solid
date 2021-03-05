package aula03;

public class Teste {

	public static void main(String[] args) {
		
		TabelaDePreco tabela = new TabelaDePrecoDiferenciada();
		ServicoDeEntrega entrega = new Frete();
		
		CalculadoraDePrecos calculadora =  new CalculadoraDePrecos(tabela, entrega);
	}

}
