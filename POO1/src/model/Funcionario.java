package model;

public class Funcionario {
	public String nome;
	public double salario;
	public String cargo;
	private int salarioMinimo = 1420;
	private int desconto = 10;
	private int beneficio = 300;
	

	public Funcionario(String nome, double salario, String cargo) {
		this.nome = nome;
		this.salario = salario = Math.max(salario, salarioMinimo);
		this.cargo = cargo;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		
		return salario;
	}


	public void setSalario(double salario) {
		if(salario< salarioMinimo) {
			this.salario = salarioMinimo;
		}else {
			this.salario = salario;
		}
		
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double salarioLiquido() {
		 return this.salario - (this.salario * (desconto / 100.0)) + beneficio;
	}
	
	
	
}
