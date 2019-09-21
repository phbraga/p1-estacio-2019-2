package aula8;

public class Cachorro {
    private String nome;
    private String raca;

    Cachorro(String nome, String raca) {
        this.setNome(nome);
        this.setRaca(raca);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        if(raca != null && !raca.isEmpty()) {
            this.raca = raca;
        }
    }

    public void latir() {
        System.out.println("Latindo");
    }

    public void dormir() {
        System.out.println("Dormindo");
    }

    public void comer() {
        System.out.println("Comendo");
    }

}
