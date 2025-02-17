
public class Ottagono implements Poligono {

    private double lato;

    private final double COST;

    public Ottagono(double lato) {
        this.lato = lato;
        COST = 4.828;
    }

 
    @Override
    public String calcolaAreaPerimetro() {
        double perimetro = lato *8;
        double area = (lato * lato) * COST;
        String result = "Il perimetro è: " + perimetro +" l'area è: " + area;
        return result;
    }

}
