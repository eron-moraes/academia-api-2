package fit.com.model;

import lombok.Data;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "modalidades", schema = "4fit")
public class Modalidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@ManyToMany
	@JoinTable(name = "modalidade_aluno", joinColumns = @JoinColumn(name = "modalidade_id"), inverseJoinColumns = @JoinColumn(name = "aluno_id"))
	private Set<Aluno> alunos = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "modalidade_professor", joinColumns = @JoinColumn(name = "modalidade_id"), inverseJoinColumns = @JoinColumn(name = "professor_id"))
	private Set<Professor> professores = new HashSet<>();
}
