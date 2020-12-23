public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double index1 = service.calculate(65, 1.65);
        System.out.println("Индекс массы тела равен " + String.format("%.1f", index1));

        double index2 = service.calculate(51.5, 1.57);
        System.out.println("Индекс массы тела равен " + String.format("%.1f", index2));

        double index3 = service.calculate(80.3, 1.7);
        System.out.println("Индекс массы тела равен " + String.format("%.1f", index3));

        double index4 = service.calculate(90, 1.66);
        System.out.println("Индекс массы тела равен " + String.format("%.1f", index4));

        double index5 = service.calculate(88, 1.92);
        System.out.println("Индекс массы тела равен " + String.format("%.1f", index5));
    }
}
