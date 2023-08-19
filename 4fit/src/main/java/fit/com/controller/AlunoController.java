package fit.com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.com.dbservice.AlunoService;
import fit.com.model.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @PostMapping
    public ResponseEntity<Aluno> createAluno(@RequestBody Aluno aluno) {
        Aluno createdAluno = alunoService.createAluno(aluno);
        return ResponseEntity.ok(createdAluno);
    }
}
