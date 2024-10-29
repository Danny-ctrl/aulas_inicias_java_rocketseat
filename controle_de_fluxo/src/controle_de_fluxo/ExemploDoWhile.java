package controle_de_fluxo;

import java.util.Random;

import javax.swing.tree.AbstractLayoutCache;

public class ExemploDoWhile {
	private static int numeroDeTentativas =0;
	public static void main(String[] args) {
		System.out.println("Discando ...");
		
		do {
			//executando repetidas vezes
			System.out.println("Telefone tocando...");
			
		}while(tocando());
		if(numeroDeTentativas<5)
		
		System.out.println("Alô!!!");
		else
			System.out.println("caixa postal");
		
	}
		private static boolean tocando() {
			numeroDeTentativas++;
			boolean atendeu = new Random().nextInt(5)==1;
			if(numeroDeTentativas>=5)
				return false;
			else
			return !atendeu;
	}

}
