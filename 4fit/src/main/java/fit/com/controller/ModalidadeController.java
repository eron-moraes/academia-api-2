package fit.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.com.model.Modalidade;
import fit.com.repository.ModalidadeRepository;

@RestController
@RequestMapping("/modalidades")
public class ModalidadeController {
    @Autowired
    private ModalidadeRepository modalidadeRepository;

    @GetMapping
    public List<Modalidade> listarModalidades() {
        return modalidadeRepository.findAll();
    }

    @PostMapping
    public Modalidade criarModalidade(@RequestBody Modalidade modalidade) {
        return modalidadeRepository.save(modalidade);
    }
}

