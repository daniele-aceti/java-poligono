
public class App {

    public static void main(String[] args) {
        Poligono ottagono = new Ottagono(10.2);
        System.out.println(ottagono.calcolaAreaPerimetro());

        Poligono pentagono = new Pentagono(30);
        System.out.println(pentagono.calcolaAreaPerimetro());
    }
}
