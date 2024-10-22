package controle_de_fluxo;

import java.util.Random;

public class ExemploWhile {

	public static void main(String[] args) {
		boolean acordado = true;
		int carneirinhos = 0;
		while(acordado) {
			System.out.println("contando carneirinhos .." + (++carneirinhos));
			acordado = !(new Random().nextInt(3) ==carneirinhos);
			if(carneirinhos==20)
				carneirinhos =0;
		}
		System.out.println("Dormiu..");
	}

}
