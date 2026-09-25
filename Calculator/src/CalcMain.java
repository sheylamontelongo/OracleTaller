public class CalcMain {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int addResult = calc.add(10, 5);
        System.out.println("10 + 5 = " + addResult);

        int subResult = calc.subtract(10, 5);
        System.out.println("10 - 5 = " + subResult);

        int mulResult = calc.multiply(10, 5);
        System.out.println("10 * 5 = " + mulResult);

        try {
            double divResult = calc.divide(10, 5);
            System.out.println("10 / 5 = " + divResult);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}