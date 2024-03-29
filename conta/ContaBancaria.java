package conta;

public class ContaBancaria {

  private String numero;
  private String titular;
  private double saldo;

  // construtor
  public ContaBancaria() {
    this.saldo = 0.0;
  }
  // getters - buscar informação

  // setters - inserir informação
  // set+nome do atibuto com primeira letra maiuscula
  public void setNumero(String numero) {
    // this para pegar o atributo e não o paramentro
    this.numero = numero;// numero do atributo vai receber o numero do paramentro
  }

  // tipo tem que ser o mesmo do atributo
  public String getNumero() {
    return this.numero;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public String getTitular() {
    return titular;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  // depositar
  void depositar(double valor) {
    if (valor > 0) {
      saldo = saldo + valor;
      System.out.println("Depósito de R$ " + valor + ".Saldo atual R$" + saldo);
    } else {
      System.out.println("O valor de depósito é inválido");
    }
  }

  void sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo = saldo - valor;
      System.out.println("Saque de R$" + valor + ".Saldo atual R$" + saldo);
    }
  }
}
