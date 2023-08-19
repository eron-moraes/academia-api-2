package fit.com.dbservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fit.com.model.Modalidade;
import fit.com.repository.ModalidadeRepository;

@Service
public class ModalidadeService {
    @Autowired
    private ModalidadeRepository modalidadeRepository;

    public List<Modalidade> getAllModalidades() {
        return modalidadeRepository.findAll();
    }

    public Modalidade createModalidade(Modalidade modalidade) {
        return modalidadeRepository.save(modalidade);
    }
}

