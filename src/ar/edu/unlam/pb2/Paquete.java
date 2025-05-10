package ar.edu.unlam.pb2;

public class Paquete {
	
	private double altura;
	private double anchura;
	private double profundidad;
	private double peso;
	
	public Paquete(double altura, double anchura, double profundidad, double peso) {
		this.altura=altura;
		this.anchura=anchura;
		this.profundidad=profundidad;
		this.peso=peso;
	}
	
	public double calcularVolumen() {
		return altura*anchura*profundidad;
	}
	
	
	
	
}
