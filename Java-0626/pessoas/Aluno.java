package pessoas;

public class Aluno extends Pessoa {
    
    public String Situacao;
    public double Media;
   
    protected void setSituacao(String situacao){
        Situacao=situacao;
    }
    protected void setMedia(double media){
        Media=media;
    }
    protected String getSituacao(){
        return Situacao;
    }
    protected double getMedia(){
        return Media;
    }
    //Metodos
   public void SalvarAluno(double media){
   
    //chama o metodo da super classe
    SalvarPessoa();

    // atribui o valor da media
    Media = media;
    if (media >= 6.0){
        Situacao = "Aprovado";
    }else{
        Situacao = "Reprovado";    
    }

   }
   public String exibirAluno(){
    return exibirPessoa()+"Media: "+Media+" Situacao: "+Situacao;
   }
   public String alunosTurma(String turma){
    //variavel
    String alunos;
    //seleção das turmas
    switch(turma) {
     case "301":
       alunos = "\n-Amanda\n-Kauã\n-João\n-Giovana\n-Martha\n-Murilo";
     break;
     case "201":
       alunos = "\n-Eduardo\n-Fernanda\n-Ryan\n-Jurandir\n-Gabriel\n-Camila";
     break;
      case "101":
       alunos = "\n-Luana\n-Diogo\n-Breno\n-Kai\n-Lavinia\n-Luiza";
     break;
     default:
        alunos = "sem alunos para selecionar ";
     break;
    }
    return alunos;
   }
}
