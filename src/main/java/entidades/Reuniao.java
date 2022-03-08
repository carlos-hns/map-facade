package entidades;

public class Reuniao {

    String id;
    String horario;

    public Reuniao(String id, String horario) {
        this.id = id;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Reuniao " + this.id + " - " + this.horario;
    }
}
