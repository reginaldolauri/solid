package aula02feito;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		
		List<AcaoAposGerarNota> acoes = new ArrayList<>();
		
		acoes.add(new NotaFiscalDao());
		acoes.add(new EnviadorDeEmail());
		
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);

		Fatura fatura = new Fatura();
		fatura.setValorMensal(100);
		
		gerador.gera(fatura);
	}

}
