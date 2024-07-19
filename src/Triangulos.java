public class Triangulos extends Formas{

    private double ladoTriangulo1;
    private double ladoTriangulo2;
    private double ladoTriangulo3;

    @Override
    void calcularArea() {

    }

    @Override
    void calcularPerimetro() {

    }

    public double getLadoTriangulo1() {
        return ladoTriangulo1;
    }

    public void setLadoTriangulo1(double ladoTriangulo1) {
        this.ladoTriangulo1 = ladoTriangulo1;
    }

    public double getLadoTriangulo2() {
        return ladoTriangulo2;
    }

    public void setLadoTriangulo2(double ladoTriangulo2) {
        this.ladoTriangulo2 = ladoTriangulo2;
    }

    public double getLadoTriangulo3() {
        return ladoTriangulo3;
    }

    public void setLadoTriangulo3(double ladoTriangulo3) {
        this.ladoTriangulo3 = ladoTriangulo3;
    }

    @Override
    public String toString() {
        return  " 1° lado Triangulo: " + ladoTriangulo1 +
                "\n 2° lado Triangulo: " + ladoTriangulo2 +
                "\n 3° lado Triangulo: " + ladoTriangulo3 +
                "\n área triangulo: " + super.getArea() +
                "\n perimetro triângulo: " + super.getPerimetro();
    }
}
