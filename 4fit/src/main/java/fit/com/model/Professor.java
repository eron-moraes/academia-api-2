package fit.com.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	@ManyToMany(mappedBy = "professores")
	private Set<Modalidade> modalidades = new HashSet<>();

	public Professor(Long id, String nome, Set<Modalidade> modalidades) {
		super();
		this.id = id;
		this.nome = nome;
		this.modalidades = modalidades;
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

	public Set<Modalidade> getModalidades() {
		return modalidades;
	}

	public void setModalidades(Set<Modalidade> modalidades) {
		this.modalidades = modalidades;
	}

	
	
}
