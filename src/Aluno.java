public class Aluno extends Pessoa {
    public String matricula;
    private Boolean ativo;

    public Aluno(String nome, int idade, String matricula, Boolean ativo) {
        super(nome, idade);
        this.matricula = matricula;
        this.ativo = ativo;
    }

    public void desativarCadastro(){
        this.ativo = false;
    }
}
