import java.util.Random;
public class TesteVetorDinamico {
  public static void main(String[] args) throws Exception{
    //construir um vetor dinamico de tamanho 8
    //use o operador de inferência de tipo
    var teste = new VetorDinamico(4);
    var gerador = new Random(); 
    //loop infinito com while
    while(true){
      var valor = gerador.nextInt(10) + 1;
      var oQueFazer = gerador.nextDouble();
      if(oQueFazer <= 0.4){
        System.out.println("Removendo...");
        teste.remover();
      }
      else{
        //adicionar
        System.out.println("Adicionando...");
        teste.adicionar(valor);
      }
      System.out.println(teste);
      System.out.println("==================");
      //dormir por 5 segundos
      Thread.sleep(3000);
    }
  }
}
