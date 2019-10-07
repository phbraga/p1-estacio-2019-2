package av1;

public class Investimento extends Juros {

    private float capital;
    private int tempo;
    private float montante;

    public Investimento () {
        super();
        this.capital = 0.0F;
        this.tempo = 0;
        this.montante = this.calculaMontante(this.tempo, this.capital);
    }

    public Investimento (float tx_juros_mensal, float aliquota, float juros_ir,
                         float capital, int tempo, float montante) {
        super(tx_juros_mensal, aliquota, juros_ir);

        this.capital = capital;
        this.tempo = tempo;
        this.montante = montante;
    }
    public float getCapital() {
        return this.capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getTempo() {
        return this.tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public float getMontante() {
        return this.montante;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }

    public float calculaJuros () {
        return this.getMontante() - this.getCapital();
    }
}
