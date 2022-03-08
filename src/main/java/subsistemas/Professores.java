package subsistemas;

import entidades.Professor;

import java.util.ArrayList;
import java.util.List;

public class Professores {
    private List<Professor> professores = new ArrayList<>();

    public void addProfessor(long id, String nome, String disciplina, String tempo){
        Professor professor = new Professor(id,nome,disciplina,tempo);

        professores.add(professor);
    }

    public List<Professor> getProfessores() {
        
        professores.add(new Professor(1l, "Antonio", "Matematica", "1 Ano"));
        professores.add(new Professor(2l, "Fábio", "Introdução ao inferno", "5 Anos"));
        professores.add(new Professor(3l, "Sabrina", "MAP", "3 Anos"));
        professores.add(new Professor(4l, "Demetrio", "IA", "2 Anos"));
          
        return professores;
    }
}
