import java.util.Scanner;
public class SomarDoisNumeros{
  public static void main(String [] args){
    //declaração de variáveis
    Scanner leitor = new Scanner(System.in);
    // int a;
    // int b;
    // int soma;
    int a, b, resultadoDaSoma;
    //entrada de dados
    System.out.println("Digite um valor");
    a = leitor.nextInt();
    System.out.println("Digite outro valor");
    b = leitor.nextInt();
    //processamento
    resultadoDaSoma = a + b;
    //saída
    //3 + 4 = 7
    //System.out.println(a + " + " + b + " = " + resultadoDaSoma);
    System.out.printf("%d + %d = %d\n", a, b, resultadoDaSoma);
  }
}
