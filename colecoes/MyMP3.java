import java.util.ArrayList;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
//faça o import do método showMessageDialog
import static javax.swing.JOptionPane.showMessageDialog;
public class MyMP3 {
  public static void main(String[] args) {
    var musicas = new ArrayList<Musica>();

    // {
    //   int a = 2;
    //   System.out.println(a);
    // }
    // System.out.println(a);
    //1 - Cadastrar uma música
    //2 - Visualizar a lista de músicas
    //3 - Remover música
    //0 - Sair
    int op;
    var menu = 
      "1-Cadastrar música\n2-Listar músicas\n3-Remover música\n0-Sair";
    do{
      op = parseInt(showInputDialog(menu));
      switch(op){
        case 1:{
          var titulo = showInputDialog("Titulo?");
          var musica = new Musica(titulo);
          musicas.add(musica);
          showMessageDialog(null, "Música adicionada!");
          break;
        }
        case 2:{
          //verificar se o arraylist musicas tem pelo menos uma musica
            if(!musicas.isEmpty()){
              var sb = new StringBuilder("");
              //for each Java5++
              for(var m : musicas){
                sb.append(m.getTitulo()).append("\n");
              }
              showMessageDialog(null, sb.toString());
            }
            break;
        }
        case 3:{
          var titulo = showInputDialog("Titulo?");
          musicas.remove(new Musica(titulo));
          break;
        }
        case 0:{
          showMessageDialog(null, "Até mais");
          break;
        }
        default:{
          break;
        }
      }

    }while(op != 0);
  }
}
