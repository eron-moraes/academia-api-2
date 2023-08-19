package fit.com.dbservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fit.com.model.Aluno;
import fit.com.repository.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> getAllAlunos() {
		return alunoRepository.findAll();
	}

	public Aluno createAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
}
