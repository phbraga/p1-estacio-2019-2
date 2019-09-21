package aula6e7;

public class Departamento {
    private int codigo;
    private String nome;

    Departamento(int codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        if (codigo >= 0) {
            this.codigo = codigo;
        } else {
            System.out.println("Favor informar valor maior ou igual a zero");
        }
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Favor informar string não vazia e não nulo");
        }
    }

    @Override
    public String toString() {
        return "Departamento \nNome: " + this.getNome() + ", Codigo: " + this.getCodigo();
    }
}
