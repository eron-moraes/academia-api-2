package fit.com.model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "professores", schema = "4fit")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@ManyToMany(mappedBy = "professores")
	private Set<Modalidade> modalidades = new HashSet<>();
}
