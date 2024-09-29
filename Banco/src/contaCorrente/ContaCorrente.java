package contaCorrente;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
//atributos
	Integer numero;
	Integer agencia;
	String nomeCliente;
	LocalDate dataNascimento;
	private Double saldo;
	boolean ativo = true;
	List<String> extrato;
	
	//metodos
	Double consultarSaldo() {
		return saldo;
	}
	
	List <String>consultarExtrato (LocalDate dataInicial,LocalDate dataFinal) {
	return 	extrato;
	}

	void cancelar(String justificativa) {

	}

	void transferir(ContaCorrente contaDestino, Double valorTransferido) {

	}

	void sacar(Double valorSolicitado) {
	}

}
