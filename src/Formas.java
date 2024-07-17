public abstract class Formas {


    private double perimetro;
    private double area;

    abstract void calcularArea();

    abstract void calcularPerimetro();

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
