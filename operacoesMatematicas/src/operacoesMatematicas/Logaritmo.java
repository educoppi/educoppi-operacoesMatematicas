package operacoesMatematicas;

public class Logaritmo {
	private double numero=0;

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public double calcLogaritmo(double numero) {
		return Math.log(numero);
	}
}
