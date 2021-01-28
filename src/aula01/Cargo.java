package aula01;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteCincoPorCento()),
	TESTER(new QuinzeOuVinteCincoPorCento());
	
	private RegraDeCalculo regra;

	private Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
	
}
