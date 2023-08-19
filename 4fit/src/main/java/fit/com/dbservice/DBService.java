package fit.com.dbservice;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fit.com.model.Aluno;
import fit.com.model.Modalidade;
import fit.com.model.Professor;

@Service
public class DBService {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private ModalidadeService modalidadeService;

    public void instanciaBaseDeDados() throws ParseException {
        // Criação de Alunos
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Pedro");

        alunoService.createAluno(aluno1);
        alunoService.createAluno(aluno2);
        alunoService.createAluno(aluno3);

        // Criação de Professores
        Professor professor1 = new Professor();
        professor1.setNome("Professor A");

        Professor professor2 = new Professor();
        professor2.setNome("Professor B");

        Professor professor3 = new Professor();
        professor3.setNome("Professor C");

        professorService.createProfessor(professor1);
        professorService.createProfessor(professor2);
        professorService.createProfessor(professor3);

        // Criação de Modalidades
        Modalidade modalidade1 = new Modalidade();
        modalidade1.setNome("CrossFit");
        modalidade1.getAlunos().addAll(Arrays.asList(aluno1, aluno2));
        modalidade1.getProfessores().addAll(Arrays.asList(professor1, professor2));

        Modalidade modalidade2 = new Modalidade();
        modalidade2.setNome("Yoga");
        modalidade2.getAlunos().addAll(Arrays.asList(aluno2, aluno3));
        modalidade2.getProfessores().addAll(Arrays.asList(professor2, professor3));

        Modalidade modalidade3 = new Modalidade();
        modalidade3.setNome("Pilates");
        modalidade3.getAlunos().addAll(Arrays.asList(aluno1, aluno3));
        modalidade3.getProfessores().addAll(Arrays.asList(professor1, professor3));

        modalidadeService.createModalidade(modalidade1);
        modalidadeService.createModalidade(modalidade2);
        modalidadeService.createModalidade(modalidade3);
    }
}
