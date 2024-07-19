public class Circulo extends Formas{

    private double raio;
    private double diametro;

    public Circulo(double raio) {
        this.raio = raio;
        this.calcularDiametro();
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    void calcularArea() {
        super.setArea( 3.14 * (this.raio*this.raio));
    }

    @Override
    void calcularPerimetro() {
        super.setPerimetro( 3.14 * this.diametro);
    }

    void calcularDiametro(){
        diametro = raio * 2;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "raio: " + this.raio +
                "\n diametro: " + this.diametro +
                "\n area Circulo: " + super.getArea() +
                "\n perimetro Circulo: "+ super.getPerimetro();
    }
}
