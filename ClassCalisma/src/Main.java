public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Car audi = new Car("Audi", 10,"Blue");

        audi.increaseSpeed(20);
        audi.decreaseSpeed(5);
        audi.printSpeed();

        audi.printInfo();

        Car bmw = new Car();
        bmw.model = " BMW i8";
        bmw.speed = 20;
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = " MERCEDES";
        mercedes.speed = 20;
        mercedes.printSpeed();
    }
}