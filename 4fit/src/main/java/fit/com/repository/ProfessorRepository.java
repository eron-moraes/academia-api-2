package fit.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fit.com.model.Professor;



public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

