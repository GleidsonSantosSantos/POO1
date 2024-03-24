package model;

public class Circulo {
public double raio;
	
	public void Circulo1(double raio) {
		this.raio =raio;
	}
	 public double getPerimetro() {
		 return 2 * Math.PI * raio;
	 }
	 public double getArea() {
		 return Math.PI *raio *raio;
	 }
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
}
