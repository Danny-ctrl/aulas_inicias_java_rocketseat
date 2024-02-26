package veiculo;

public class Moto implements Veiculo {

  @Override
  public void acelerar() {
    System.out.println("acelerando a moto");
  }

  @Override
  public void frear() {
    System.out.println("freando a moto");
  }

}
