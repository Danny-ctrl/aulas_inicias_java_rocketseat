package src.controle_de_fluxo;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile2 {

	public static void main(String[] args) {
		double mesada =50.0;
		
		while(mesada > 0) {
			Double valorDoce = valorALeatorio();
			if(valorDoce > mesada)
				valorDoce = mesada;
			
			System.out.println("Doce do valor: " + valorDoce + 
					" Adicionado no carrinho");
			mesada = mesada - valorDoce;
		}
		System.out.println("Mesada:" + mesada);
		System.out.println("Anya gastou toda a sua mesada em doces");
	}
private static double valorALeatorio() {
	return ThreadLocalRandom.current().nextDouble(2,8);
}
}
