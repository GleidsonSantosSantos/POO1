package view;

import model.Circulo;

public class Exe1_Circulo {
public static void main(String[] args) {
	Circulo cl = new Circulo();
	cl.setRaio(-5);
	
	double perimetro=cl.getPerimetro();
	double area = cl.getArea();
	System.out.println(perimetro);
	System.out.println(area);
	
			
}
}
