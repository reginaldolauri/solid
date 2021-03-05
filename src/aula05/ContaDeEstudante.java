package aula05;


public class ContaDeEstudante {

	private ManipuladorDeSaldo manipuladorDeSaldo;
    private int milhas;

    
    public ContaDeEstudante() {
		this.manipuladorDeSaldo = new ManipuladorDeSaldo();
	}
    
    public void deposita(double valor) {
        this.manipuladorDeSaldo.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
    
    public double getSaldo() {
		return this.manipuladorDeSaldo.getSaldo();
	}

}