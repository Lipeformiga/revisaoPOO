public class Retangulo extends Formas{

    private double ladoRetangulo1;
    private double ladoRetangulo2;

    public Retangulo(double ladoRetangulo1, double ladoRetangulo2) {
        this.ladoRetangulo1 = ladoRetangulo1;
        this.ladoRetangulo2 = ladoRetangulo2;
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    void calcularArea() {
        super.setArea(this.ladoRetangulo1 * this.ladoRetangulo2);
    }

    @Override
    void calcularPerimetro() {
        super.setPerimetro((this.ladoRetangulo1 * 2) + (this.ladoRetangulo2 * 2));
    }

    public double getLadoRetangulo1() {
        return ladoRetangulo1;
    }

    public void setLadoRetangulo1(double ladoRetangulo1) {
        this.ladoRetangulo1 = ladoRetangulo1;
    }

    public double getLadoRetangulo2() {
        return ladoRetangulo2;
    }

    public void setLadoRetangulo2(double ladoRetangulo2) {
        this.ladoRetangulo2 = ladoRetangulo2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "ladoRetangulo1=" + ladoRetangulo1 +
                ", ladoRetangulo2=" + ladoRetangulo2 +
                ", area retangulo: "+ super.getArea() +
                '}';
    }
}
