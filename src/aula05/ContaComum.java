package aula05;

public class ContaComum {

    private ManipuladorDeSaldo manipuladorDeSaldo;

    public ContaComum() {
        this.manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void saca(double valor) {
		this.manipuladorDeSaldo.saca(valor);
	}

    public void deposita(double valor) {
    	this.manipuladorDeSaldo.deposita(valor);
    }

    public void rende() {
        this.manipuladorDeSaldo.rende(1.1);
    }

    public double getSaldo() {
		return this.manipuladorDeSaldo.getSaldo();
	}
}