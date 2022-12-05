public class Main {
    public static void main(String[] args) {
        BodyMassService service = new BodyMassService();
        double growth = 1.75;
        double weight = 81.2;
        double index = service.calculate(weight, growth);
        System.out.println("Индекс массы тела равен - " + Math.round(index));

    }
}