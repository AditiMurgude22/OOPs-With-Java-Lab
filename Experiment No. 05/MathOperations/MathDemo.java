package MathOperations;

public class MathDemo {
    public static void main(String[] args) {
        double number = 5.7;

        System.out.println("Number: " + number);
        System.out.println("Floor: " + MyMath.findFloor(number));
        System.out.println("Ceil: " + MyMath.findCeil(number));
        System.out.println("Round: " + MyMath.findRound(number));
    }
}