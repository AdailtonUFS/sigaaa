import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Turma {
    public String nome;
    public Date inicio;
    public Date fim;
    public String horario;
    public Professor professor;
    public List<Aluno> alunos = new ArrayList<>();
    public List<Atividade> atividades = new ArrayList<>();

    public Turma(String nome, Date inicio, Date fim, String horario) {}

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void adicionarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }

    public void adicionarProfessor(Professor professor) {
        this.professor = professor;
    }
}
