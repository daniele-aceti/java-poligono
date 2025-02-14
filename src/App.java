
public class App {

    public static void main(String[] args) {
        Ottagono ottagono = new Ottagono(10.2);
        System.out.println("L'area è " + ottagono.calcolaArea());
        System.out.println("Il perimetro è: " + ottagono.calcolaPerimetro());

        Pentagono pentagono = new Pentagono(30);
        System.out.println("L'area è " + pentagono.calcolaArea());
        System.out.println("Il perimetro è: " + pentagono.calcolaPerimetro());
    }
}
