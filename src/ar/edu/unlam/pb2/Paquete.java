package ar.edu.unlam.pb2;

public class Paquete {
	
	private double altura;
	private double anchura;
	private double profundidad;
	private Integer peso;
	
	public Paquete(double altura, double anchura, double profundidad, Integer peso) {
		this.altura=altura;
		this.anchura=anchura;
		this.profundidad=profundidad;
		this.peso=peso;
	}
	
	public double calcularVolumen() {
		return altura*anchura*profundidad;
	}

	public Integer getPeso() {
		return this.peso;
	}
	
	
	
	
}
