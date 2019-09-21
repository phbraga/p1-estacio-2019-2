package aula6e7;

public class AplicacaoAula {
    public static void main (String[] args) {
        Departamento d1 = new Departamento(10, "CIn");
        Funcionario f1 = new Funcionario(1, "Joao", d1);

        System.out.println(f1.toString());

        System.out.println(ConversaoDeUnidadesDeTempo.diaParaHoras(2));

    }
}
