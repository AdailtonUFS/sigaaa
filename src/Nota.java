public class Nota {
    public Float pontuacao;
    public Avaliacao avaliacao;
    public Aluno aluno;

    public void registrarNota(Float pontuacao, Avaliacao avaliacao, Aluno aluno){
        this.pontuacao = pontuacao;
        this.avaliacao = avaliacao;
        this.aluno = aluno;
    }
}
