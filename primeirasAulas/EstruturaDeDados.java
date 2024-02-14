package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
  public static void main(String[] args) {
    // Lista
    List<String> nomes = new ArrayList<>();
    nomes.add("Dani");
    nomes.add("Paulo");
    nomes.add("Thiago");
    nomes.add("Sergio");

    // System.out.println(nomes.get(1));
    // for(String nome:nomes){
    // System.out.println("O nome é " +nome);
    // }

    nomes.forEach(nome -> System.out.println("O nome que apareceu foi " + nome));
  }
}
