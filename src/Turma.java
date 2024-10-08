import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Turma {
    public String nome;
    public Date inicio;
    public Date fim;
    public String horario;
    public String codigo;
    public Professor professor;
    public List<Aluno> alunos = new ArrayList<>();
    public List<Atividade> atividades = new ArrayList<>();

    public Turma(String nome, Date inicio, Date fim, String horario) {
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void adicionarAtividade(Professor professor,Atividade atividade) throws Exception {
        if (professor == null || professor != this.professor) {
            throw new Exception("O professor que está cadastrando a atividade não é o professor responsável pela turma");
        }
        this.atividades.add(atividade);
    }

    public void adicionarProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turma consuntarTurma(String codigo) throws Exception {
        if (this.codigo.equals(codigo)) {
            throw new Exception("Turma não encontrado");
        }
        return this;
    }
}
