package chapter02;

public class Excercise09 {

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

      /*  switch(taste) {
            case "too cold": tempAdjustment += 1;
               break;
            case "way too hot": tempAdjustment -= 1;
               break;
            case "too hot": tempAdjustment -= 1;
               break;
            case "just right":
            default:
                break;
        }
        System.out.println("Adjust temperature "+ tempAdjustment);*/
    }
}
