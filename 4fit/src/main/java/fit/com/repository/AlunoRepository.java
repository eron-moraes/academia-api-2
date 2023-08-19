package fit.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fit.com.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
