package ar.edu.unlam.pb2;

public class Paquete {
	
	private Double altura;
	private Double anchura;
	private Double profundidad;
	private Double peso;
	
	public Paquete(Double altura, Double anchura, Double profundidad, Double peso) {
		this.altura=altura;
		this.anchura=anchura;
		this.profundidad=profundidad;
		this.peso=peso;
	}
	
	public double calcularVolumen() {
		return altura*anchura*profundidad;
	}

	public Double getPeso() {
		return this.peso;
	}
	
	
	
	
}
