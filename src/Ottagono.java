
public class Ottagono implements Poligono {

    private double lato;

    private final double COST;

    public Ottagono(double lato) {
        this.lato = lato;
        COST = 4.828;
    }

    @Override
    public double calcolaPerimetro() {
        double perimetro = lato * 8;
        return perimetro;
    }

    @Override
    public double calcolaArea() {
        double area = (lato * lato) * COST;
        return area;
    }

}
