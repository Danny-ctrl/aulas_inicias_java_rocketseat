package contaCorrente;

public class CaixaEletronico {

	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 26.0;
		
		if(valorSolicitado <= saldo) {
			saldo = saldo - valorSolicitado;
		
		System.out.println("Saque realizado com sucesso");
		System.out.println("saldo restante é de " + saldo);
	}else 
       System.out.println("saldo insuficiente");
	

		}
	

}
