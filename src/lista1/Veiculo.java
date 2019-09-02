package lista1;

public class Veiculo {
    String nome;
    String tipo;
    int passageiros;
    int rodas;
    float velocidade;

    void acelerar () {
        ++velocidade;
    }

    void desacelerar () {
        --velocidade;
    }

    void parar () {
        velocidade = 0;
    }
}
