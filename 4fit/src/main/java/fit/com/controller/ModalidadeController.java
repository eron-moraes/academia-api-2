package fit.com.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.com.dbservice.ModalidadeService;
import fit.com.model.Modalidade;

@RestController
@RequestMapping("/modalidades")
public class ModalidadeController {
    @Autowired
    private ModalidadeService modalidadeService;

    @GetMapping
    public List<Modalidade> getAllModalidades() {
        return modalidadeService.getAllModalidades();
    }

    @PostMapping
    public ResponseEntity<Modalidade> createModalidade(@RequestBody Modalidade modalidade) {
        Modalidade createdModalidade = modalidadeService.createModalidade(modalidade);
        return ResponseEntity.ok(createdModalidade);
    }
}


