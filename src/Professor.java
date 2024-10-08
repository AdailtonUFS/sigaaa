public class Professor extends Pessoa{
    public String formacao;
    public Boolean ativo;

    public Professor(String nome, int idade, String matricula, Boolean ativo, String formacao) {
        super(nome, idade, matricula);
        this.ativo = ativo;
        this.formacao = formacao;
    }

    public void desativarCadastro(){
        this.ativo = false;
    }
}
