package fit.com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.com.dbservice.ProfessorService;
import fit.com.model.Professor;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> getAllProfessores() {
        return professorService.getAllProfessores();
    }

    @PostMapping
    public ResponseEntity<Professor> createProfessor(@RequestBody Professor professor) {
        Professor createdProfessor = professorService.createProfessor(professor);
        return ResponseEntity.ok(createdProfessor);
    }
}
