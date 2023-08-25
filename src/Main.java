public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int weight = 98;
        double height = 1.87;
        System.out.println(bmiService.calculate(weight, height));
    }
}
