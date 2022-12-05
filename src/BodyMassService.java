public class BodyMassService {
    public double calculate(double weightBody, double growthBody) {
        return (double) (weightBody / (growthBody * growthBody));
    }
}