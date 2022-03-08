package entidades;

public class Professor {
    private long id;
    private String nome;
    private String disciplina;
    private String tempoDeCasa;

    public Professor(long id, String nome, String disciplina, String tempoDeCasa) {
        this.id = id;
        this.nome = nome;
        this.disciplina = disciplina;
        this.tempoDeCasa = tempoDeCasa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(String tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }
}
