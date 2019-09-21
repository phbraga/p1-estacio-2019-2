package aula6e7;

public class Funcionario {
    private int matricula;
    private String nome;
    private Departamento depto;

    Funcionario(int matricula, String nome, Departamento depto) {
        setMatricula(matricula);
        setNome(nome);
        setDepto(depto);
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDepto() {
        return depto;
    }

    public void setMatricula(int matricula) {
        if (matricula >= 0) {
            this.matricula = matricula;
        } else {
            System.out.println("Favor informar matricula maior ou igual a 0");
        }
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Favor informar nome não vazio e não nulo");
        }
    }

    public void setDepto(Departamento depto) {
        if (depto != null) {
            this.depto = depto;
        } else {
            System.out.println("Favor informar depto não nulo");
        }
    }

    @Override
    public String toString() {
        return "Funcionario:\nMatricula: " + this.getMatricula() +
                ", Nome: " + this.getNome() + "\n" + this.getDepto().toString();
    }
}
