package model;

public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;

   

    public ContaBancaria(int numeroConta, String nome, double saldo) {
	
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public double realizarDeposito(double valor) {
        saldo += valor;
        return saldo;
    }

    public double realizarSaque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return saldo;
        } else {
            System.out.println("Sem Saldo suficiente para realizar o saque.");
            return -1;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

