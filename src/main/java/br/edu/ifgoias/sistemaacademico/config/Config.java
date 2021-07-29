package br.edu.ifgoias.sistemaacademico.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.edu.ifgoias.sistemaacademico.entities.Curso;
import br.edu.ifgoias.sistemaacademico.repository.CursoRepository;

import br.edu.ifgoias.sistemaacademico.entities.Aluno;
import br.edu.ifgoias.sistemaacademico.repository.AlunoRepository;

@Configuration
public class Config implements CommandLineRunner{

	@Autowired
	private CursoRepository cursoRep ;
	

	@Autowired
	private AlunoRepository alunoRep ;
	
	@Override
	public void run(String... args) throws Exception {
		
		Curso c1 = new Curso(null, "Curso Teste1");
		Curso c2 = new Curso(null, "Curso Teste2");
		cursoRep.saveAll(Arrays.asList(c1,c2));
		

		Aluno a1 = new Aluno(null, "Lucas", "Masculino", null);
		Aluno a2 = new Aluno(null, "Gabriela", "Feminino", null);
		alunoRep.saveAll(Arrays.asList(a1,a2));
	}

}
