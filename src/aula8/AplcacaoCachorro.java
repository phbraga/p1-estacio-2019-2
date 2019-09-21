package aula8;

public class AplcacaoCachorro {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Cachorro1", "Puddle");
        CachorroAdestrado cachorroAdestado1 = new CachorroAdestrado("CachorroAdestrado1", "Salsicha");

        imprime(cachorro1);
        imprime(cachorroAdestado1);
    }

    public static void imprime(Cachorro c) {
        System.out.println("Nome: " + c.getNome());
        System.out.println("Raca: " + c.getRaca());

        c.latir();
        c.comer();
        c.dormir();

        if (c instanceof CachorroAdestrado) {
            ((CachorroAdestrado) c).deitar();
            ((CachorroAdestrado) c).rolar();
            ((CachorroAdestrado) c).fingirMorto();
        }
    }
}
