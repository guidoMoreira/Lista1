package exe10;

public class Disciplina {

    public String nome_professor;
    public String nome;
    public String email_professor;
    public String sala;
    public String codigo;


    public Disciplina() {}

    public Disciplina(String nome_professor, String nome,
                      String email_professor, String sala, String codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.nome_professor = nome_professor;
        this.email_professor = email_professor;
        this.sala = sala;
    }

    public String get_professor() {
        return this.nome_professor;
    }

    public String get_nome() {
        return this.nome;
    }

    public String get_email_professor() {
        return this.email_professor;
    }

    public String get_sala() {
        return this.sala;
    }


    public void set_nome(String nome) {
        this.nome = nome;
    }

    public void set_professor(String professor) {
        this.nome_professor = professor;
    }

    public void set_email_professor(String email_professor) {
        this.email_professor = email_professor;
    }

    public void set_sala(String sala) {
        this.sala = sala;
    }


    public String toString() {
        return "\n\nDisciplina: " + this.nome + "\nProfessor: " + this.nome_professor + "\nEmail do professor: "
                + this.email_professor + "\nSala: " + this.sala + "\nCodigo: " + this.codigo;
    }
}
