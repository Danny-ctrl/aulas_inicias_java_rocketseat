/*PrimeiraClasse = Nome da Classe
 * public = Tipo de acesso da classe
 * class = tipo da classe
 * static = pertence a classe e não a uma instancia
 * void = tipo de retorno
 * main = nome do metodo,por padrão do java,obrigatorio para ser o ponto de partida da aplicação
 * String[] args = o metodo pode receber um array tipo string 
 */
public class PrimeiraClasse {
  // todo conteudo deverá ser inserido aqui dentro
  public static void main(String[] args) {
    // numeros(int,double,float,long)
    // texto(String)
    // boleano(boolean)
    int dadoDoTipoInt = 10;
    double dadoDoTipoDouble = 3.14;
    float dadoDoTipoFloat = 3.14f;
    long dadoDoTipoLong = 458484458484L;
    String dadoDoTipoString = "Coloque o texto aqui";
    boolean dadoDoTipoBoolean = true;

    // if-else
    if (dadoDoTipoInt == 11) {
      // sysout
      System.out.println("Entrou no if");
    } else if (dadoDoTipoInt == 12) {
      System.out.println("Entrou no if do 12");
    } else {
      System.out.println("Entrou no else");
    }
    // While (Enquanto algo for verdadeiro faça alguma coisa)

    int valorInicial = 0;
    while (valorInicial < 3) {
      System.out.println("o valor inicial é menor que 3");
      valorInicial++; // incrementa valor inicial
    }
    System.out.println("Saiu do while");
    // For
    System.out.println("Iniciando o For");
    for (int i = 0; i < 4; i++) {
      System.out.println("O valor do i é: " + i);
    }
    System.out.println("Fim do For");
  }
}
// Fora do escopo da classe