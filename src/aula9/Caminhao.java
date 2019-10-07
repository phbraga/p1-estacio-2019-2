package aula9;

public class Caminhao extends Veiculo {
    private int toneladas;
    private int alturaMax;
    private int comprimento;
    private float desconto;

    Caminhao () {
        super();
        this.toneladas = 0;
        this.alturaMax = 0;
        this.comprimento = 0;
        this.desconto = 0;
    }

    Caminhao (int peso, int velocMax, float preco, Motor motor,
              int toneladas, int alturaMax, int comprimento, float desconto) {
        super(peso, velocMax, preco, motor);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
        this.desconto = desconto;
    }

    public int getToneladas() {
        return this.toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMax() {
        return this.alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public float getDesconto() {
        return this.desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float calculaPrecoFinal() {
        return this.getPreco() * (1.0F - this.desconto);
    }
}
