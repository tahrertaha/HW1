import java.math.BigInteger;

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int numOdd = 0;
        BigInteger current = BigInteger.ONE;
        BigInteger next = BigInteger.ONE;
        System.out.println("The first " + x + " Fibonacci numbers are:");

        for (int i = 0; i < x; i++) {
            System.out.print(current);
            if (i < x - 1) {
                System.out.print(" ");
            }
            if (current.testBit(0)) {
                numOdd++;
            }
            BigInteger sum = current.add(next);
            current = next; 
            next = sum;

        
        }
        System.out.println();        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
