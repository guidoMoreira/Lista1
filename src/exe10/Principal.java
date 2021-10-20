package exe10;


/*
 * a) Anderson Soares da Silva e Mariana Gonçalves Rodrigues
 * b) Postagem anterior está correta
 * c) Periodo, indica o progresso do aluno na graduação
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
 * Periodo: Voce esta no 5 periodo. Voce completou 40% do seu curso
 *
 *
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
        System.out.println("\nDigite o Campus da sua universidade:");
        String CidadeCampus = entrada.nextLine();

        System.out.println("\nDigite a Cidade em que mora:");
        String CidadeMora = entrada.nextLine();


        Estudante et = new Estudante(nome, cpf, curso, email_aluno,
                nota1, nota2, telefone);

        Disciplina dp = new Disciplina(nome_professor, nome_dp,
                email_professor,sala, codigo);


        System.out.println(et);

        Nota aux = new Nota (nota1, nota2);
        System.out.println(aux + " " + dp);

        Periodo p = new Periodo(periodo);

        Cidade cidades = new Cidade(CidadeMora,CidadeCampus);
        cidades.PrintCid(nome);
    }
}




