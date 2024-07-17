public class Circulo extends Formas{

    private double raio;
    private double diametro = raio * 2;

    public Circulo(double raio, double diametro) {
        this.raio = raio;
        this.diametro = diametro;
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    void calcularArea() {
        super.setArea( 3.14 * (raio*2));
    }

    @Override
    void calcularPerimetro() {
        super.setPerimetro( this.raio * this.diametro);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", diametro=" + diametro +
                ", area Circulo:" + super.getArea() +
                '}';
    }
}
