package aula9;

public class CarroPasseio extends Veiculo {

    private String cor;
    private String modelo;

    CarroPasseio () {
        super();
        this.cor = "";
        this.modelo = "";
    }

    CarroPasseio (int peso, int velocMax, float preco, Motor motor,
                  String cor, String modelo) {
        super(peso, velocMax, preco, motor);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
