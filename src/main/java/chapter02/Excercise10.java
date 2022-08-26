package chapter02;

public class Excercise10 {

    public static void main(String[] args) {

        String taste = "way to hot";

        int tempAdjustment = switch (taste) {
            case "too cold" -> 1;
            case "way to hot" -> -2;
            case "too hot" -> -1;
            case "just right" -> 0;
            default -> 0;
        };

        System.out.println("Adjust temperature "+ tempAdjustment);
    }
}
