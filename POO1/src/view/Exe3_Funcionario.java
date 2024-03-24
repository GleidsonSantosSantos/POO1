package view;

import java.util.Locale;
import java.util.Scanner;


import model.Funcionario;

public class Exe3_Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Seu nome: ");
		String nome =sc.nextLine();
		
		System.out.println("Seu salario: ");
		double salario =sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite Seu cargo: ");
		String cargo =sc.nextLine();
		
		Funcionario fc = new Funcionario(nome, salario, cargo);
		
		System.out.println("nome: " +fc.getNome() +", " +  " Salario de : " +"R$"+ fc.salarioLiquido() +", "  +" Cargo de:  " + fc.getCargo());
		sc.close();

	}

}
