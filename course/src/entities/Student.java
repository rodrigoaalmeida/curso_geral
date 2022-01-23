package entities;

public class Student {
	public String name;
	public double primeiroTrimenstre;
	public double segundoTrimenstre;
	public double terceiroTrimenstre;
	
	public double notaFinal;
	
	public double calcularNota() {
		notaFinal = primeiroTrimenstre + segundoTrimenstre + terceiroTrimenstre;
		return notaFinal;
	}
	
	public String testeResultado() {
		if(notaFinal >= 60) {
			return "PASS";
		}
		else {
			return "FAILED"
					+ String.format("%nMISSING %.2f POINTS", 60.00 - notaFinal);
		}
	}
}
