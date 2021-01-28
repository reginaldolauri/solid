package aula01;

import java.util.Calendar;

public class Funcionario {

	private int id;
	private String nome;
	private Cargo cargo;
	private Calendar dataDeAdmissao;
	private double salarioBase;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Calendar dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double calculaSalario() {
		return this.cargo.getRegra().calcula(this);
	}

}
