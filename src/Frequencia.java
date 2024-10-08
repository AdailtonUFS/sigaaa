public class Frequencia {
    public Aula aula;
    public Aluno aluno;
    public Boolean presente;

    public void registrarFrequencia(Aula aula, Aluno aluno, Boolean presente) {
        this.aula = aula;
        this.aluno = aluno;
        this.presente = presente;
    }
}
