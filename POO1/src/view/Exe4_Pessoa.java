package view;

import java.time.LocalDate;

import model.Pessoa;

public class Exe4_Pessoa {

	public static void main(String[] args) {
	    LocalDate dataNascimento = LocalDate.of(1997, 7, 19);
        Pessoa pessoa = new Pessoa("Gleidson", dataNascimento, "Progrmador");
        pessoa.getAtributos();
        System.out.println("Idade: " + pessoa.getIdade() + " anos");

	}

}
