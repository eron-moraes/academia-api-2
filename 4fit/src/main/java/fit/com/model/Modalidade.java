package fit.com.model;

import java.util.HashSet;

import org.hibernate.mapping.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Modalidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	public Modalidade(Long id, String nome, Set<Aluno> alunos, Set<Professor> professores) {
		super();
		this.id = id;
		this.nome = nome;
		this.alunos = alunos;
		this.professores = professores;

		@ManyToMany
		@JoinTable(name = "modalidade_aluno", joinColumns = @JoinColumn(name = "modalidade_id"), inverseJoinColumns = @JoinColumn(name = "aluno_id"))
		private Set<Aluno> alunos = new HashSet<>();

		@ManyToMany
		@JoinTable(name = "modalidade_professor", joinColumns = @JoinColumn(name = "modalidade_id"), inverseJoinColumns = @JoinColumn(name = "professor_id"))
		private Set<Professor> professores = new HashSet<>();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Set<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(Set<Professor> professores) {
		this.professores = professores;
	}

}
