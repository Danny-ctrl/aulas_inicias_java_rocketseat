package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    pessoa1.cpf = "1546854218541";
    pessoa1.nome = "Daniele";
    pessoa1.idade = 30;

    System.out.println(pessoa1.imprimirDadosDaPessoa());

    Pessoa pessoa2 = new Pessoa();
    pessoa2.cpf = "15468542198451";
    pessoa2.nome = "Paulo";
    pessoa2.idade = 30;

    System.out.println(pessoa2.imprimirDadosDaPessoa());
  }
}
