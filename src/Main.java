public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio de la aplicación.");

        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");

        smartphone.llamar("123-456-789");

        smartphone.fotografiar();

        smartphone.alarma();

        System.out.println("Fin de la aplicación.");
    }
}
