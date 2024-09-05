import javax.swing.JOptionPane;
public class TesteLivroDeNotas{
  static public void main(String...args){
    //construir um livro de notas
    //java 10+: operador de inferência de tipo
    var disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina");
    var meuLivro = new LivroDeNotas();
    meuLivro.nomeDisciplina = disciplina1;
    //acionar o comportamento sobre ele
    meuLivro.exibirMensagem();

    //construir um segundo livro de notas
    //e fazer com que ele exiba a mensagem
    var disciplina2 = JOptionPane.showInputDialog("Digite o nome da disciplina 2");
    var meuLivro2 = new LivroDeNotas();
    meuLivro2.nomeDisciplina = disciplina2;
    meuLivro2.exibirMensagem();

    //new LivroDeNotas();

  }
}