import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

//        ROUNDED NUMBER

        BigDecimal number1 = new BigDecimal("4.2545");
        double result1 = roundToHundredth(number1);
        System.out.println(result1);  // Output: 4.25

//        REVERSED NUMBER
        BigDecimal number2 = new BigDecimal("-45.67");
        BigDecimal result2 = reverseSign(number2);
        System.out.println(result2);

    }

    public static double roundToHundredth(BigDecimal number) {
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
        return roundedNumber.doubleValue();
    }

    public static BigDecimal reverseSign(BigDecimal number) {
        BigDecimal reversedNumber = number.negate();
        BigDecimal roundedNumber = reversedNumber.setScale(1, RoundingMode.HALF_UP);
        return roundedNumber;
    }
}

