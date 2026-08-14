package entities;

public abstract class Pessoa {
	String nome;
	Integer id;
	

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public abstract Integer getId();
	
}
