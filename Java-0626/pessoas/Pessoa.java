package pessoas;

public class Pessoa {
    
    // atributos
    private String Nome;
    private int Idade;

    //Construtor
    public Pessoa(){
        System.out.print("Ola pessoal");
    }

    //set e get
    protected void setNome(String nome ){
        Nome=nome;
    }
    protected  void setIdade(int idade){
        Idade=idade;
    }
    protected String getNome(){
        return Nome;
    }
    protected int getIdade(){
        return Idade;
    }


    // Metodos
    protected void SalvarPessoa(){
        Nome = "Douglas";
        Idade = 18;
    }
    public void resgistrar(){
        SalvarPessoa();
    }
    public String exibirPessoa(){
        return "Nome: "+Nome+" Idade: "+Idade;
    }
}
