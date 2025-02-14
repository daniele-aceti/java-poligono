
public class Pentagono implements Poligono {

    private double lato;

    private final double COST;

    public Pentagono(double lato) {
        this.lato = lato;
        COST = 1.72;
    }

    @Override
    public double calcolaPerimetro() {
        double perimetro = lato * 5;
        return perimetro;
    }

    @Override
    public double calcolaArea() {
        double area = (lato * lato) * COST;
        return area;
    }

}
