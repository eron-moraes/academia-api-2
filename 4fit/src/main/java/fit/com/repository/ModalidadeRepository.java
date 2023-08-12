package fit.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fit.com.model.Modalidade;

public interface ModalidadeRepository extends JpaRepository<Modalidade, Long> {
}
