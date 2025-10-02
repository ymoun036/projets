package com.example.devoir1.exercice1;
public class TransportTest {

    public static void main(String[] args) {
        Bike[] bikes = new Bike[5];
        Car[] cars = new Car[6];
        Plane[] planes = new Plane[7];
        Helicopter[] helicopters = new Helicopter[8];

        // Create bikes.
        bikes[0] = new Bike();
        System.out.println();

        bikes[1] = new Bike(12.0, 20.0);
        System.out.println();

        bikes[2] = new Bike(14.0, 22.0);
        System.out.println();

        bikes[3] = new Bike(11.0, 18.0);
        System.out.println();

        bikes[4] = new Bike(13.0, 24.0);
        System.out.println();

        // Create cars.
        cars[0] = new Car();
        System.out.println();

        cars[1] = new Car(1500.0, 120.0);
        System.out.println();

        cars[2] = new Car(1800.0, 140.0);
        System.out.println();

        cars[3] = new Car(1300.0, 110.0);
        System.out.println();

        cars[4] = new Car(1600.0, 130.0);
        System.out.println();

        cars[5] = new Car(1700.0, 145.0);
        System.out.println();

        // Create planes.
        planes[0] = new Plane();
        System.out.println();

        planes[1] = new Plane(60000.0, 780.0);
        System.out.println();

        planes[2] = new Plane(55000.0, 760.0);
        System.out.println();

        planes[3] = new Plane(65000.0, 790.0);
        System.out.println();

        planes[4] = new Plane(58000.0, 770.0);
        System.out.println();

        planes[5] = new Plane(62000.0, 785.0);
        System.out.println();

        planes[6] = new Plane(68000.0, 800.0);
        System.out.println();

        // Create helicopters.
        helicopters[0] = new Helicopter();
        System.out.println();

        helicopters[1] = new Helicopter(4000.0, 200.0);
        System.out.println();

        helicopters[2] = new Helicopter(3500.0, 190.0);
        System.out.println();

        helicopters[3] = new Helicopter(4500.0, 210.0);
        System.out.println();

        helicopters[4] = new Helicopter(5000.0, 220.0);
        System.out.println();

        helicopters[5] = new Helicopter(5500.0, 230.0);
        System.out.println();

        helicopters[6] = new Helicopter(6000.0, 240.0);
        System.out.println();

        helicopters[7] = new Helicopter(6500.0, 250.0);
        System.out.println();

        // Test error cases.
        System.out.println("\n--- Testing error cases ---\n");

        try {
            new Bike(-1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 1: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Bike(10, Bike.getMaxSpeed() + 1);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 2: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Bike(-1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 3: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Bike(Bike.getMaxWeight() + 1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 4: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Car(-1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 5: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Car(10, Car.getMaxSpeed() + 1);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 6: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Car(-1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 7: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Car(Car.getMaxWeight() + 1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 8: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Plane(-1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 9: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Plane(10, Plane.getMaxSpeed() + 1);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 10: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Plane(-1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 11: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Plane(Plane.getMaxWeight() + 1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 12: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Helicopter(-1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 13: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Helicopter(10, Helicopter.getMaxSpeed() + 1);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 14: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Helicopter(-1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 15: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        try {
            new Helicopter(Helicopter.getMaxWeight() + 1, 10);
        } catch (IllegalArgumentException e) {
            System.err.printf("Case 16: cannot create object: '%s'.\n", e.toString());
        }
        System.out.println();

        // Test getRegistrationTime().
        System.out.println("\n--- Testing getRegistrationTime() ---\n");
        System.out.println("Bike registration time: " + Bike.getRegistrationTime());
        System.out.println("Car registration time: " + Car.getRegistrationTime());
        System.out.println("Plane registration time: " + Plane.getRegistrationTime());
        System.out.println("Helicopter registration time: " + Helicopter.getRegistrationTime());

        // Test count().
        System.out.println("\n--- Testing count() ---\n");
        System.out.println("Number of Bike instances: " + Bike.count());
        System.out.println("Number of Car instances: " + Car.count());
        System.out.println("Number of Plane instances: " + Plane.count());
        System.out.println("Number of Helicopter instances: " + Helicopter.count());

        // Test dump().
        System.out.println("\n--- Testing dump() ---\n");
        bikes[0].dump();
        System.out.println();

        cars[1].dump();
        System.out.println();

        planes[2].dump();
        System.out.println();

        helicopters[3].dump();
        System.out.println();

        // Test run().
        System.out.println("\n--- Testing run() ---\n");
        bikes[0].run();
        System.out.println();

        cars[1].run();
        System.out.println();

        planes[2].run();
        System.out.println();

        helicopters[3].run();
        System.out.println();

    }
}
