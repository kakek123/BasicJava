package chapter02;

public class Example09 {

    public static void main(String[] args) {

        String cat = new String("cat");
        String dog = new String("Dog");

        if(cat.equals(dog)) {
            System.out.println("Cats and Dogs are the same.");
        }

        if(!cat.equals(dog)) {
            System.out.println("Cats and Dogs are not the same");
        }

        if(dog.equals(dog)) {
            System.out.println("Dogs are dogs");
        }

        if(dog.equals("dog")) {
            System.out.println("Dogs are dogs");
        }

        if("dog".equals(dog)) {
            System.out.println("Dogs are dogs");
        }
    }
}
