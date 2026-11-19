public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int terms = Integer.parseInt(args[0]);
        double sign = 1.0;
        for (int i = 0; i < terms; i++) {
            double denominator = 2.0 * i + 1;
            approxPi += sign / denominator;
            sign = -sign;
        }
        
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
