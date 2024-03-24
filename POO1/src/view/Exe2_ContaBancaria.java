package view;

import java.util.Locale;
import java.util.Scanner;

import model.ContaBancaria;

public class Exe2_ContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite o número da conta: ");
		int numeroConta =sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite Seu nome: ");
		String nome =sc.nextLine();
		
		System.out.println("Digite Seu saldo: ");
		double saldo = sc.nextDouble();
		
	
	ContaBancaria cb = new ContaBancaria(numeroConta, nome, saldo);
	
	 System.out.println("Deseja fazer um depósito (D), um saque (S) ou sair (Q)?");
     String opcao = sc.next();
     
     if(opcao.equalsIgnoreCase("D")) {
    	 System.out.println("Digite o Valor do depósito");
    	 double valorDepositado =sc.nextInt();
    	 cb.realizarDeposito(valorDepositado);
    	 System.out.println("Deposito realizado com suceso");
     }else if(opcao.equalsIgnoreCase("S")) {
    	 System.out.println("Digite o Valor do saque");
    	 double valorSaque =sc.nextInt();
    	cb.realizarSaque(valorSaque);
    	 System.out.println("Saque Realizado com Sucesso");
     }else if(opcao.equals("Q")) {
    	 System.out.println("Programa encerrado");
    	 System.exit(0);
     
     }
	
     
	System.out.println("Conta do: " +cb.getNome() +", " +  " De numero: " + cb.getNumeroConta() +", "  +" Esta com Saldo:  " + "R$"+ cb.getSaldo());
sc.close();
	
	}

}
