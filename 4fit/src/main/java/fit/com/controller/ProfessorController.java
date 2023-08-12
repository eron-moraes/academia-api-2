package fit.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.com.model.Professor;
import fit.com.repository.ProfessorRepository;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping
    public List<Professor> listarProfessores() {
        return professorRepository.findAll();
    }

    @PostMapping
    public Professor criarProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }
}
