package aula8;

public class CachorroAdestrado extends Cachorro {

    CachorroAdestrado(String nome, String raca) {
        super(nome, raca);
    }

    public void deitar() {
        System.out.println("Deitando");
    }

    public void rolar() {
        System.out.println("Rolando");
    }

    public void fingirMorto(){
        System.out.println("Fingindo de Morto");
    }
}
