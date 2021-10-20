
/*
 * a) Bruno keller Margaritelli e Guido Margonar Moreira
 * b) Postagem anterior está correta
 * c) Cidades do campus e onde o aluno mora.
 * d) Entrada:
 * Joao
 * joaopedefeijao@gmail.com
 * 123.456.789-x
 * Engenharia da Computacao
 * 43 333-226
 * Programação 1
 * Gilberto
 * gilcomp@gmail.com
 * E45
 * 1234
 * 8,0
 * 6,0
 * 5
 * Apucarana
 * Apucarana
 * Saida:
 * Nome: Joao / Email aluno: joaopedefeijao@gmail.com / Curso: Engenharia da Computacao / CPF: 123.456.789.x / Telefone: 43 333-226 / Notas: 8.0, 6.0
 * Media : 7.0
 * Situacao:Aprovado
 *
 * Disciplina: Programação 1
 * Professor: Gilberto
 * Email do professor: gilcomp@gmail.com
 * Sala: E45
 * Codigo: 1234
 * Voce esta no 5 periodo. Voce completou 40% do seu curso
 * Joao mora em Apucarana, que é a mesma cidade do seu campus.
 */


import java.util.Scanner;

public class Principal {

    public Principal() {

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nNome do aluno:");
        String nome = entrada.nextLine();

        System.out.println("\nEmail do aluno:");
        String email_aluno = entrada.nextLine();

        System.out.println("\nCpf do aluno:");
        String cpf = entrada.nextLine();

        System.out.println("\nCurso:");
        String curso = entrada.nextLine();

        System.out.println("\nTelefone do aluno:");
        String telefone = entrada.nextLine();

        System.out.println("\nNome da Disciplina:");
        String nome_dp = entrada.nextLine();

        System.out.println("\nNome do Professor:");
        String nome_professor = entrada.nextLine();

        System.out.println("\nEmail do Professor:");
        String email_professor = entrada.nextLine();

        System.out.println("\nSala do Professor:");
        String sala = entrada.nextLine();

        System.out.println("\nCodigo da Disciplina:");
        String codigo = entrada.nextLine();


        System.out.println("\nNota 1:");
        float nota1 = entrada.nextFloat();

        System.out.println("\nNota 2:");
        float nota2 = entrada.nextFloat();

        System.out.println("\nDigite o período que está cursando:");
        int periodo = entrada.nextInt();

        entrada.nextLine();
        System.out.println("\nDigite a cidade do Campus de sua universidade:");
        String CidadeCampus = entrada.nextLine();

        System.out.println("\nDigite a Cidade em que mora:");
        String CidadeMora = entrada.nextLine();


        exe10.Estudante et = new exe10.Estudante(nome, cpf, curso, email_aluno,
                nota1, nota2, telefone);

        exe10.Disciplina dp = new exe10.Disciplina(nome_professor, nome_dp,
                email_professor,sala, codigo);


        System.out.println(et);

        exe10.Nota aux = new exe10.Nota(nota1, nota2);
        System.out.println(aux + " " + dp);

        exe10.Periodo p = new exe10.Periodo(periodo);

        exe10.Cidade cidades = new exe10.Cidade(CidadeMora,CidadeCampus);
        cidades.PrintCid(nome);
    }
}

class Estudante extends Nota {

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

class Nota {

    public float nota;
    public float nota2;


    public Nota() {
    }

    public Nota(float nota, float nota2) {
        this.nota = nota;
        this.nota2 = nota2;
    }

    public float media() {
        float resultado;
        resultado = (nota + nota2) / 2 ;
        return resultado;
    }

    public String getSituacao() {
        if(this.media() > 6) {
            return ("Aprovado");
        } else {
            if (nota > nota2) {
                return ("Prova substitutiva, prova2");
            } else {
                return ("Prova substitutiva, prova1");
            }
        }
    }

    public String toString() {
        return "Media : " + this.media() +
                "\nSituacao:" + this.getSituacao();
    }
}

class Disciplina {

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

class Periodo {
    public int periodo;

    public Periodo() {

    }

    public Periodo(int periodo) {
        this.periodo = periodo;
        verificaPeriodo(periodo);
    }

    public void verificaPeriodo(int periodo) {
        if(periodo == 1) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 0% do seu curso");
        } else if(periodo == 2) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 10% do seu curso");
        } else if(periodo == 3) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 20% do seu curso");
        } else if(periodo == 4) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 30% do seu curso");
        } else if(periodo == 5) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 40% do seu curso");
        } else if(periodo == 6) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 50% do seu curso");
        } else if(periodo == 7) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 60% do seu curso");
        } else if(periodo == 8) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 70% do seu curso");
        } else if(periodo == 9) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 80% do seu curso");
        } else if(periodo == 10) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 90% do seu curso, parabéns e boa sorte com o seu TCC :)");
        } else {
            System.out.println("este não  é um periodo existente.");
        }

    }

}
class Cidade {
    private String CidadeMora;
    private String CidadeCampus;
    public Cidade(String CidadeMora, String CidadeCampus){
        this.CidadeCampus = CidadeCampus;
        this.CidadeMora = CidadeMora;
    }

    public String getMora(){
        return CidadeMora;
    }
    public String getCampus(){
        return CidadeCampus;
    }
    public void PrintCid(String nome){
        if(CidadeMora.equals(CidadeCampus)) {
            System.out.println(nome + " mora em "+CidadeMora+", que é a mesma cidade do seu campus.");
        }else{
            System.out.println(nome + " estuda no campus de " + CidadeCampus + " mas mora em " + CidadeMora+".");
        }
    }
}
