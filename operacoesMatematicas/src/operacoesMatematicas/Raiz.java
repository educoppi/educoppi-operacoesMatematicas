package operacoesMatematicas;

public class Raiz {
	private double numero=0;
	
	
	public double getNumero() {
		return numero;
	}
	
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public double calcRaizQuadrada(double numero) {
		return Math.pow(numero, 2);
	}
}
