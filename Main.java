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

        System.out.println("-----------------------------------------------------------------------------");


//        CAR INVENTORY SYSTEM
        Car sedan = new Sedan("1HGCM82633A123456", "Honda", 2500, "Accord");
        Car utilityVehicle = new UtilityVehicle("2FMDK3GC5BBB12345", "Ford", 40000, "Escape", true);
        Car truck = new Truck("1FTFW1EF3EKD12345", "Ford", 55000, "F-150", 5.5);

        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());

        System.out.println("-----------------------------------------------------------------------------");

//        VIDEO STREAMING SERVICE

        Video tvSeries = new TvSeries("Breaking Bad", 3000, 62);
        Video movie = new Movie("Inception", 148, 8.8);

        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());

        System.out.println("-----------------------------------------------------------------------------");



//         INTLIST INTERFACE

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

