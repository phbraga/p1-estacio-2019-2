package aula9;

public class Veiculo {
    private int quilos;
    private int velocMax;
    private float preco;
    private Motor motor;

    Veiculo () {
        this.quilos = 0;
        this.velocMax = 0;
        this.preco = 0;
        this.motor = new Motor();
    }

    Veiculo (int quilos, int velocMax, float preco, Motor motor) {
        this.quilos = quilos;
        this.velocMax = velocMax;
        this.preco = preco;
        this.motor = motor;
    }

    public int getQuilos() {
        return this.quilos;
    }

    public void setQuilos(int quilos) {
        this.quilos = quilos;
    }

    public int getVelocMax() {
        return this.velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
