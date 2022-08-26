package chapter02;

public class Excercise03 {

    public static void main(String[] args) {

        int speed = 75;
        int maxSpeed = 60;
        int speedForLine = 70;

        if(speed > maxSpeed) {
            System.out.println("Your speed is greater than max. speed limit");

        } else if (speed < maxSpeed) {
            System.out.println("Your speed is less than max. speed limit ");
        } else {
            System.out.println("Your speed is equal to the max. speed limit");
        }
    }
}
