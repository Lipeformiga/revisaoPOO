public class Quadrado extends Formas{

    private double ladoQuadrado;

    public Quadrado(double ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    void calcularArea(){
        super.setArea(this.ladoQuadrado * 2.0);
    }

    @Override
    void calcularPerimetro() {
        super.setPerimetro(this.ladoQuadrado * 4);
    }

    public double getLadoQuadrado() {
        return ladoQuadrado;
    }

    public void setLadoQuadrado(double ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    @Override
    public String toString() {
        return "Lado Quadrado: " + this.ladoQuadrado +
                "\n area quadrado: "+ super.getArea()+
                "\n perimetro quadrado: "+ super.getPerimetro();
    }
}
