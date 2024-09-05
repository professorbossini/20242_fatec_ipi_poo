import javax.swing.JOptionPane;
public class LivroDeNotas{
  //variável de instância
  String nomeDisciplina = null;
  //método de instância
  public void exibirMensagem(){
    //System.out.println("Bem vindo ao livro de notas");
    JOptionPane.showMessageDialog(
      null,
      String.format(
        "Bem vindo ao livro de notas da disciplina %s",
        nomeDisciplina
      )
    );
  }
}