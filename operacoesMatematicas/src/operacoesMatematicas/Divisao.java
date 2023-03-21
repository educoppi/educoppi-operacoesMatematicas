package operacoesMatematicas;

public class Divisao {
	private float numero1=0;
	private float numero2=0;
	
	
	public float getNumero1() {
		return numero1;
	}
	
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	
	public float getNumero2() {
		return numero2;
	}
	
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	
	public boolean seValorIgualAZero(float numero1, float numero2) {
		
		if ((numero1 == 0) || (numero2 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public float calcDivisao(float numero1, float numero2) {
		
		return (numero1 / numero2);
	}
}
