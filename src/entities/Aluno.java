package entities;

public class Aluno extends Pessoa{
	private Turma turma;

	public Aluno(String nome, Turma turma) {
		super(nome);
		this.turma = turma;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
