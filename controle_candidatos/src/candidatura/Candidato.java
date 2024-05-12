import java.util.Random;

public class Candidato {
    private String nome;
    private double salario_pretendido;

    public Candidato(String nome, double salario_pretendido) {
        this.nome = nome;
        this.salario_pretendido = salario_pretendido;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario_pretendido() {
        return salario_pretendido;
    }

    public boolean atender() {

        return new Random().nextBoolean();

    }
}
