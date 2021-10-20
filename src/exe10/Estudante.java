package exe10;

public class Estudante extends Nota {

    private String nome;
    private String cpf;
    private String curso;
    private String telefone;
    private String email_aluno;


    public Estudante () {
    }

    public Estudante(String nome, String cpf, String curso, String email_aluno,
                     float nota, float nota2, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.email_aluno = email_aluno;
        this.nota = nota;
        this.nota2 = nota2;
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + this.nome + " / Email aluno: " + this.email_aluno +
                " / Curso: " + this.curso + " / CPF: " + this.cpf +
                " / Telefone: " + this.telefone +
                " / Notas: " + this.nota + ", " + this.nota2;
    }
}