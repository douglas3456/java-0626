package escola;
import pessoas.Aluno;

public class Chamada {

    // atributo
    public String Turma;


   // construtor
    public Chamada(  String mensagem, String turma ){
       // escreve a mensagem
        String texto = "Ola turma"+turma+" "+mensagem+ "\n";
        System.out.print(texto);
        //atribui o valor
           Turma=turma;
           //metodo
           selecionarTurma();
           selecionarAlunos();
    }

    private void selecionarTurma(){
        String texto = "Turma: "+Turma+ "selecionada \n";
        System.out.println(texto);
    }
    
     private void selecionarAlunos( ){
      Aluno aluno = new Aluno();
      System.out.println( aluno.alunosTurma(Turma));       
          
    }
}