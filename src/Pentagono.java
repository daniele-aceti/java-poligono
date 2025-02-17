
public class Pentagono implements Poligono {

    private double lato;

    private final double COST;

    public Pentagono(double lato) {
        this.lato = lato;
        COST = 1.72;
    }


    @Override
    public String calcolaAreaPerimetro() {
        double perimetro = lato * 5;
        double area = (lato * lato) * COST;
        String result = "Il perimetro è: " + perimetro +" l'area è: " + area;
        return result;
    }

}
