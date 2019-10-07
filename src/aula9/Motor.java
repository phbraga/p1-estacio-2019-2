package aula9;

public class Motor {
    private int numCilindros;
    private int potencia;

    Motor () {
        this.numCilindros = 0;
        this.potencia = 0;
    }

    Motor (int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    public int getNumCilindros() {
        return this.numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
