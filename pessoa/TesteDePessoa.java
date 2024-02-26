package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.setCpf("1546854218541");
    professor.setNome("Daniele");
    professor.setIdade(30);
    professor.setSalario(50000);
    System.out.println(professor.imprimirDadosDaPessoa());

    Aluno aluno = new Aluno();
    aluno.setCpf("15468542198451");
    aluno.setNome("Paulo");
    aluno.setIdade(30);
    aluno.setMatricula("4581584");

    System.out.println(aluno.imprimirDadosDaPessoa());
  }
}
