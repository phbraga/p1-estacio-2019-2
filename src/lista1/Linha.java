package lista1;

public class Linha {
    Ponto2D origem;
    Ponto2D fim;

    Linha() {
        this.origem = new Ponto2D();
        this.fim = new Ponto2D();
    }

    Linha(Ponto2D fim) {
        this.origem = new Ponto2D();
        this.fim = fim;
    }

    Linha(Ponto2D origem, Ponto2D fim) {
        this.origem = origem;
        this.fim = fim;
    }

    Linha(double x1, double y1, double x2, double y2) {
        this.origem = new Ponto2D(x1, y1);
        this.fim = new Ponto2D(x2, y2);
    }
}
