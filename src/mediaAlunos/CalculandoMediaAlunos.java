package mediaAlunos;
import java.util.Scanner;

// 1- Crie um programa que realize a média de duas notas decimais e exiba o resultado.

public class CalculandoMediaAlunos {
    public static void main(String[] args) {
        // criando entrada
        Scanner entrada = new Scanner(System.in);

        // pegando nome
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = entrada.nextLine();

        // entrada da primeira nota
        System.out.println("Digite a primeira nota do aluno: ");
        double notaAluno01 = entrada.nextDouble();

        // entrada da segunda nota
        System.out.println("Digite a segunda nota do aluno: ");
        double notaAluno02 = entrada.nextDouble();

        // chamar o metodo privado
        CalculandoMediaAlunos calculo = new CalculandoMediaAlunos();
        double media = calculo.mediaAlunos(notaAluno01, notaAluno02);

        // exibindo resultado
        String Resultado = String.format("A média do %s foi: %.2f", nomeAluno, media);
        System.out.println(Resultado);
        entrada.close();
    }

    private double mediaAlunos(double notaAluno01, double notaAluno02) {
        return (notaAluno01 + notaAluno02) / 2;
    }
}
