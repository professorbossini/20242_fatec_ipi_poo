import java.util.Random;
public class ExemplosVetores {
  int b;
  public static void main(String[] args) {
    int notas [] = new int[4];
    var gerador = new Random();
    System.out.println(notas[0]);
    // System.out.println(a);
    // System.out.println(b);
    //preencher o vetor com valores de interesse
    // notas[0] = 10;
    // notas[1] = 7;
    // notas[2] = 7;
    // notas[3] = 9;
    for(int i = 0; i < notas.length; i++){
      notas[i] = gerador.nextInt(11);
    }
    // notas = new int[] {10, 7, 7, 9};
    //exibir os valores nele existentes
    // System.out.println(notas[0]);
    // System.out.println(notas[1]);
    // System.out.println(notas[2]);
    // System.out.println(notas[3]);
    // System.out.println(notas[4]);
    int i = 0;
    while(i < notas.length){
      System.out.println(notas[i]);
      i++;
    }
    //for each: Java 5+
    for(var nota : notas){ //var Java10+
      System.out.println(nota);
    }

    String caracteres = "abc";
    for(var caractere : caracteres.toCharArray()){

    }



    //fazer os somatório dos elementos
    //calcular a média
    //2 minutos para fazer com for each
    int total = 0;
    for (int nota : notas){
      total += nota;
    }
    System.out.println(notas.length == 0 ? "Sem notas" : total / notas.length);
  }
}
