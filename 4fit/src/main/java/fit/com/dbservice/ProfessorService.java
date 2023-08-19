package fit.com.dbservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fit.com.model.Professor;
import fit.com.repository.ProfessorRepository;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllProfessores() {
        return professorRepository.findAll();
    }

    public Professor createProfessor(Professor professor) {
        return professorRepository.save(professor);
    }
}

