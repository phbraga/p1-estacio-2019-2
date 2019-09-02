package lista1;

public class Ponto2D {
    double x;
    double y;

    Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Ponto2D criaRevertido () {
        return new Ponto2D(this.y, this.x);
    }
}
