package fit.com.model;

import lombok.Data;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "alunos", schema = "4fit")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	@ManyToMany(mappedBy = "alunos")
	private Set<Modalidade> modalidades = new HashSet<>();
}
