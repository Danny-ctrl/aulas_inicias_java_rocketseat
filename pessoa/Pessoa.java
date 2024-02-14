package pessoa;

public class Pessoa {
  // nome,idade,cpf
  // tipo nomeDaVariavel
  // atributos
  String nome;
  int idade;
  String cpf;

  // void - ação sem retornar nada
  // void imprimirDadosDaPessoa(){
  // ação
  // };
  String imprimirDadosDaPessoa() { // metodo
    return "O nome da pessoa é " + nome + " a idade é "
        + idade + " e o documento é " + cpf;
  }
}
