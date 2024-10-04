public class Professor extends Pessoa{
    public String matricula;
    public String formacao;
    public Boolean ativo;

    public Professor(String nome, int idade, String matricula, Boolean ativo) {
        super(nome, idade);
        this.matricula = matricula;
        this.ativo = ativo;
    }

    public void desativarCadastro(){
        this.ativo = false;
    }
}
