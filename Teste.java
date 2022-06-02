public class Teste {
    public static void main(String[] args) {
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nome = "Ana";
        aluno.idade = 37;

        System.out.printf("%s %d\n", aluno.nome, aluno.idade);

        aluno.andar();
    }
}
