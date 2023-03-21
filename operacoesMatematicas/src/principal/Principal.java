package principal;

import java.util.Scanner;

import operacoesMatematicas.*;

public class Principal {

	public static void main(String[] args) {
		int menu=0;
		
		Scanner lerNum = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 - Adicao.");
			System.out.println("2 - Subtracao.");
			System.out.println("3 - Divisao.");
			System.out.println("4 - Multiplicacao.");
			System.out.println("5 - Raiz quadrada.");
			System.out.println("6 - Exponencial.");
			System.out.println("7 - Logaritmo");
			System.out.println("8 - Sair");
			System.out.println("Escolha uma das opcoes: ");
			menu = lerNum.nextInt();

			switch (menu) {
			case 1:
				Adicao adicao = new Adicao();
				
				System.out.println("Digite um numero: ");
				adicao.setNumero1(lerNum.nextFloat());
				
				System.out.println("Digite outro numero: ");
				adicao.setNumero2(lerNum.nextFloat());
				
				System.out.printf("A soma eh: %.2f\n", adicao.calcAdicao(adicao.getNumero1(), adicao.getNumero2()));
				break;

			case 2:
				Subtracao subtracao = new Subtracao();
				
				System.out.println("Digite um numero: ");
				subtracao.setNumero1(lerNum.nextFloat());
				
				System.out.println("Digite outro numero: ");
				subtracao.setNumero2(lerNum.nextFloat());
				
				System.out.printf("A subtracao eh: %.2f\n", subtracao.calcSubtracao(subtracao.getNumero1(),subtracao.getNumero2()));
				break;
			case 3:
				Divisao divisao = new Divisao();
				while (true) {
					System.out.println("Digite um numero: ");
					divisao.setNumero1(lerNum.nextFloat());

					System.out.println("Digite outro numero: ");
					divisao.setNumero2(lerNum.nextFloat());

					if (divisao.seValorIgualAZero(divisao.getNumero1(), divisao.getNumero2()) == true) {
						System.out.println("Os numeros devem ser diferentes de zero!!!");
					} else {
						break;
					}
				}

				System.out.printf("A divisao eh: %.2f\n", divisao.calcDivisao(divisao.getNumero1(), divisao.getNumero2()));
				break;

			case 4:
				Multiplicacao multiplicacao = new Multiplicacao();
				
				System.out.println("Digite um numero: ");
				multiplicacao.setNumero1(lerNum.nextFloat());
				
				System.out.println("Digite outro numero: ");
				multiplicacao.setNumero2(lerNum.nextFloat());
				
				System.out.printf("A multiplicacao: %.2f\n", multiplicacao.calcMultiplicacao(multiplicacao.getNumero1(), multiplicacao.getNumero2()));
				break;
				
			case 5:
				Raiz raiz = new Raiz();
				
				System.out.println("Digite um numero: ");
				raiz.setNumero(lerNum.nextDouble());
				
				System.out.printf("A raiz quadrada eh: %.2f\n", raiz.calcRaizQuadrada(raiz.getNumero()));
				break;
				
			case 6:
				Exponencial exponencial = new Exponencial();
				
				System.out.println("Digite um numero: ");
				exponencial.setNumero(lerNum.nextDouble());
				
				System.out.printf("O expoente eh: %.2f\n", exponencial.calcExponencial(exponencial.getNumero()));
				break;
				
			case 7:
				Logaritmo logaritmo = new Logaritmo();
				
				System.out.println("Digite um numero: ");
				logaritmo.setNumero(lerNum.nextDouble());
				
				System.out.printf("O logaritmo eh: %.2f\n",logaritmo.calcLogaritmo(logaritmo.getNumero()));
				break;
				
			case 8:
				System.out.println("Saindo...");
			}
			if (menu == 8) {
				break;
			}
		}

	}

}
