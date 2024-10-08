public class Aluno extends Pessoa {
    private Boolean ativo;

    public Aluno(String nome, int idade, String matricula, Boolean ativo) {
        super(nome, idade, matricula);
        this.ativo = ativo;
    }

    public void desativarCadastro(){
        this.ativo = false;
    }

    public Aluno consultarAluno(String matricula){
        if (!this.matricula.equals(matricula)){
            return null;
        }
        return this;
    }
}
