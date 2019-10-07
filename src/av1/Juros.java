package av1;

public class Juros {

    private float tx_juros_mensal;
    private float aliquota;
    private float juros_ir;

    public Juros() {
        this.tx_juros_mensal = 0.0F;
        this.aliquota = 0.0F;
        this.juros_ir = 0.0f;
    }

    public Juros (float tx_juros_mensal, float aliquota, float juros_ir) {
        this.tx_juros_mensal = tx_juros_mensal;
        this.aliquota = aliquota;
        this.juros_ir = juros_ir;
    }

    public float getTx_juros_mensal() {
        return this.tx_juros_mensal;
    }

    public void setTx_juros_mensal(float tx_juros_mensal) {
        this.tx_juros_mensal = tx_juros_mensal;
    }

    public float getAliquota() {
        return this.aliquota;
    }

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }

    public float getJuros_ir() {
        return this.juros_ir;
    }

    public void setJuros_ir(float juros_ir) {
        this.juros_ir = juros_ir;
    }

    public float calculaJIR(float juros) {
        return juros * (100 - this.getAliquota()) / 100;
    }

    public float calculaMontante (int tempo, float capital) {
        float montante = 1;

        for(int i = 0 ; i < tempo ; ++i) {
            montante *= (1 + this.getTx_juros_mensal() / 100);
        }

        montante *= capital;

        return montante;
    }
}
